package com.sumit.programcreek;

import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {
		Parenthesis p = new Parenthesis();
		String s = "[{()}]]";
		System.out.println(p.checkParenthesis(s));

	}

	public boolean checkParenthesis(String s) {
		Stack<Character> sc = new Stack<Character>();
		int i = 0;
		while (i < s.length()) {
		//push all the starting brackets
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				sc.push(s.charAt(i));
				//pop if the charater matches closing brackets and not the opening bracket
			} else if (s.charAt(i) == ']') {
				if (sc.isEmpty())
					return false;
				if (sc.pop() != '[')
					return false;

			} else if (s.charAt(i) == ')') {
				if (sc.isEmpty())
					return false;
				if (sc.pop() != '(')
					return false;

			} else if (s.charAt(i) == '}') {
				if (sc.isEmpty())
					return false;
				if (sc.pop() != '{')
					return false;
			}
			i++;
		}
		return sc.isEmpty();
	}
}
