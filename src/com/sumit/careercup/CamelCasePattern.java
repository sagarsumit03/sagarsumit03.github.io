package com.sumit.careercup;

import java.util.regex.Pattern;

/*
 * https://www.careercup.com/question?id=5660887265312768
 * 
 * Help:
 * http://beginnersbook.com/2014/08/java-regex-tutorial/
 * http://www.javatpoint.com/java-regex
 * http://tutorials.jenkov.com/java-regex/pattern.html
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */

public class CamelCasePattern {

	public static void main(String[] args) {
		String s = "/* complete with block comment */";
		String n = "/* without the block comment";
		String pat = "/*.*.*/";
		Pattern p = Pattern.compile(pat);
		boolean k = Pattern.matches(s, pat);
		System.out.println(k);
	}

}
