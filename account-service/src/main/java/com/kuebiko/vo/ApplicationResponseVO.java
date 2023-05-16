package com.kuebiko.vo;

public class ApplicationResponseVO {

	private String code;
	private String uri;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApplicationResponseVO [code=" + code + ", uri=" + uri + ", message=" + message + "]";
	}

}
