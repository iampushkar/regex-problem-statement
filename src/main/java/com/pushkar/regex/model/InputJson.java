package com.pushkar.regex.model;

public class InputJson {

	private String regex;
	private String textBody;

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public String getTextBody() {
		return textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

	@Override
	public String toString() {
		return "InputJson [regex=" + regex + ", textBody=" + textBody + "]";
	}
}
