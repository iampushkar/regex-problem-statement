package com.pushkar.regex.model;

public class OutputJson {

	private String match;
	private boolean error;

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "OutputJson [match=" + match + ", error=" + error + "]";
	}

}
