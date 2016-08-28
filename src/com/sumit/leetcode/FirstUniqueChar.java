package com.sumit.leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		FirstUniqueChar uc = new FirstUniqueChar();
		uc.firstUniqueChar(s);
	}
	
	
	public void firstUniqueChar(String s){
		int i=0;
		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		while(i<s.length()){
			if(freq.containsKey(s.charAt(i))){
				freq.replace(s.charAt(i), freq.get(s.charAt(i))+1);
			}else{
				freq.put(s.charAt(i), 1);
			}
			i++;
		}
		
		Iterator iterate = freq.entrySet().iterator();
		while(iterate.hasNext()){
			Map.Entry<Character, Integer> pair = (Entry<Character, Integer>) iterate.next();
			System.out.println("the key is "+pair.getKey()+ " the occuring value is "+pair.getValue());
			if(pair.getValue()==1){
				System.out.println("the first non occuring char is "+pair.getKey());
				break;
			}
		}
	}

}
