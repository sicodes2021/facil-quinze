package br.com.util;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CookieJarImpl implements CookieJar {

	private static final Set<Cookie> cookies = new HashSet<>();

	@NotNull
	@Override
	public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
		return new ArrayList<>(cookies);
	}

	@Override
	public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
		cookies.addAll(list);
	}

}
