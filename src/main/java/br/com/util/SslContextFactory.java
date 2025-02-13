package br.com.util;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class SslContextFactory {

	public static final HostnameVerifier hostnameVerifier = buildHostnameVerifier();
	public static final X509TrustManager trustManager = getTrustManager();
	public static final SSLContext sslContext = setUpSslContext();

	static HostnameVerifier buildHostnameVerifier() {
		return (hostname, session) -> hostname.equalsIgnoreCase(session.getPeerHost());
	}

	static X509TrustManager getTrustManager() {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[0];
			}

			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				/*
				 * Implementar checkClientTrusted
				 */
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				/*
				 * Implementar checkServerTrusted
				 */
			}
		} };
		return (X509TrustManager) trustAllCerts[0];
	}

	static SSLContext setUpSslContext() {
		HttpsURLConnection
				.setDefaultHostnameVerifier((hostname, session) -> hostname.equalsIgnoreCase(session.getPeerHost()));
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[0];
			}

			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				/*
				 * Implementar checkClientTrusted
				 */
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				/*
				 * Implementar checkServerTrusted
				 */
			}
		} };
		try {
			SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
			sslContext.getServerSessionContext().setSessionTimeout(3600);
			sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
			return sslContext;
		} catch (KeyManagementException | NoSuchAlgorithmException excecao) {
		}
		return null;
	}

}
