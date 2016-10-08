package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/pascals-triangle/
 */

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		PascalTriangle pt = new PascalTriangle();
		List<List<Integer>>  printArr = pt.printPascal(numRows);
		for(List<Integer> a:printArr){
			System.out.println(a);
		}
	}
	
	public List<List<Integer>>  printPascal(int numRows){
		//created a new 2D list
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		//created the Inner list
		ArrayList<Integer> row = new ArrayList<Integer>();
		//to loop til the number of Rows
		for(int i=0;i<numRows;i++)
		{
			//add to the inner list at 0 position 1.(add(int index,E element))
			row.add(0, 1);
			//Start the loop taking j=1 i.e the second row. till the row -1
			for(int j=1;j<row.size()-1;j++)
				//setting the index j with the value computing the old j and j+1
				//set(int index,E element)
				row.set(j, row.get(j)+row.get(j+1));
			//add the inner list to the main list allRows, here we are initializing
			//the inner list.
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	}

}
