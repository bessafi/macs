package com.bombardier.macs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("macs")
public class MacsProperties {

	private Urls urls;

	public static class Urls {
		private String number;
		private String string;
		private String drawing;
		private String authority;

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getString() {
			return string;
		}

		public void setString(String string) {
			this.string = string;
		}

		public String getDrawing() {
			return drawing;
		}

		public void setDrawing(String drawing) {
			this.drawing = drawing;
		}

		public String getAuthority() {
			return authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}
	}

	public Urls getUrls() {
		return urls;
	}

	public void setUrls(Urls urls) {
		this.urls = urls;
	}

	@Override
	public String toString() {
		return "MacsProperties{" + "number='" + urls.getNumber() + '\'' + ", drawing=" + urls.getDrawing()
				+ ", authority=" + urls.getAuthority() + ", string=" + urls.getString() + '}';
	}

}
