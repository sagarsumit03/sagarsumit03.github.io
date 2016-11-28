package com.sumit.careercup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * https://www.careercup.com/question?id=5722172958965760
 * 
 * Note:
 * https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html
 */

public class Quoted {

	public void unQuote() throws IOException {
		String s = null;
		File file = new File("C:\\abc.txt");
		//System.out.println(file.canRead());
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			while((s=input.readLine())!=null){
				System.out.println(s);
				if(s.contains("/*")){
					break;
				}else{
					
				}
			}
			input.close();
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Quoted quote = new Quoted();
		quote.unQuote();
	}

}
