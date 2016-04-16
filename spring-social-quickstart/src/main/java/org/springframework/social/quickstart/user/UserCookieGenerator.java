/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.quickstart.user;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.util.CookieGenerator;

/**
 * Utility class for managing the quick_start user cookie that remembers the signed-in user.
 * @author Keith Donald
 */
final class UserCookieGenerator {

	private final CookieGenerator userCookieGenerator = new CookieGenerator();
	private final CookieGenerator providerCookieGenerator = new CookieGenerator();

	public UserCookieGenerator() {
		userCookieGenerator.setCookieName("quickstart_user");
		providerCookieGenerator.setCookieName("quickstart_provider");
	}

	public void addUserCookie(String userId, HttpServletResponse response) {
		userCookieGenerator.addCookie(response, userId);
	}
	
	public void addProviderCookie(String providerId, HttpServletResponse response){
		providerCookieGenerator.addCookie(response, providerId);
	}
	
	public void removeUserCookie(HttpServletResponse response) {
		userCookieGenerator.removeCookie(response);
	}
	
	public void removeProviderCookie(HttpServletResponse response){
		providerCookieGenerator.removeCookie(response);
	}
	
	public String readUserCookieValue(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(userCookieGenerator.getCookieName())) {
				return cookie.getValue();
			}
		}
		return null;
	}
	
	public String readProviderCookie(HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(providerCookieGenerator.getCookieName())) {
				return cookie.getValue();
			}
		}
		return null;
	}

}
