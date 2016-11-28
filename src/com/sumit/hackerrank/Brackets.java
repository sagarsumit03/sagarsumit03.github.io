package com.sumit.hackerrank;

import java.util.Stack;

public class Brackets {

	public static void main(String args[]) {
		String a = "[{()}]";
		System.out.println(isBalanced(a));
	}

	public static boolean isBalanced(String e) {
		Stack<Character> s = new Stack<Character>();
		int i = 0;
		if (e == null) {
			return false;
		}
		if (e.length() % 2 != 0) {
			return false;
		} else {
			char c = '\0';
			while (i < e.length()) {
				c = e.charAt(i);
				s.push(c);
				switch (c) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.empty() || c != s.peek())
						return false;
					s.pop();
				}
				i++;
			}
		}
		return s.empty();
	}
}
