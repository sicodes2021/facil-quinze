package br.com.util;

import static br.com.util.EventosListener.FACTORY;
import static br.com.util.SslContextFactory.*;
import static java.util.Objects.requireNonNull;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.net.InetSocketAddress;
import java.net.Proxy;

import okhttp3.OkHttpClient;

/**
 * Classe responsável por criar o cliente para requisições Http. Só deverá
 * existir uma instância para fazer bom uso do pool de conexões e tratamento de
 * conexões idle.
 *
 */
public class OkHttpRequestHandler {

	private static volatile OkHttpRequestHandler instance;
	private final OkHttpClient httpClient;
	private final OkHttpClient cookieClient;
	private final OkHttpClient internHttpClient;

	private OkHttpRequestHandler() {
		this.internHttpClient = criarInternClient();
		this.cookieClient = this.internHttpClient.newBuilder().proxy(getProxy()).cookieJar(new CookieJarImpl()).build();
		this.httpClient = this.internHttpClient.newBuilder().proxy(getProxy()).build();
	}

	public synchronized static OkHttpRequestHandler getInstance() {
		if (instance == null) {
			synchronized (OkHttpRequestHandler.class) {
				instance = new OkHttpRequestHandler();
			}
		}
		return instance;
	}

	public OkHttpClient getCookieClient() {
		return this.cookieClient;
	}

	public OkHttpClient getHttpClient() {
		return this.httpClient;
	}

	public OkHttpClient getInternHttpClient() {
		return this.internHttpClient;
	}

	Proxy getProxy() {
		return new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxycorporativo.sicoob.com.br", 80));
	}

	private OkHttpClient criarInternClient() {
		return new OkHttpClient.Builder().eventListenerFactory(FACTORY).connectTimeout(30, SECONDS)
				.readTimeout(30, SECONDS).writeTimeout(60, SECONDS).callTimeout(30, SECONDS)
				.hostnameVerifier(hostnameVerifier)
				.sslSocketFactory(requireNonNull(sslContext).getSocketFactory(), trustManager).build();
	}

}
