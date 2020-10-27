package com.pushkar.regex.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pushkar.regex.model.InputJson;
import com.pushkar.regex.model.OutputJson;

@RestController
public class RegexController {

	/**
	 * @param inputJson
	 * @return OutputJson
	 */
	@PostMapping("/match")
	public OutputJson isMatch(@RequestBody InputJson inputJson) {
		System.out.println(inputJson.toString());
		String regex = inputJson.getRegex();
		String textBody = inputJson.getTextBody();

		OutputJson outputJson = matchRegex(regex, textBody);
		return outputJson;
	}

	/**
	 * @param regex
	 * @param textBody
	 * @return OutputJson
	 */
	private static OutputJson matchRegex(String regex, String textBody) {
		OutputJson outputJson = new OutputJson();

		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(textBody);
			if (matcher.find()) {
				String matchedString = matcher.group();
				System.out.println("Matched String => " + matchedString);
				outputJson.setMatch(matchedString);
				outputJson.setError(false);
			} else {
				outputJson.setMatch(null);
				outputJson.setError(false);
			}

		} catch (PatternSyntaxException e) {
			outputJson.setMatch(null);
			outputJson.setError(true);
			System.out.println("PatternSyntaxException " + e.getMessage());
		}
		return outputJson;
	}

}
