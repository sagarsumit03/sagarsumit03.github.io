package com.sumit.careercup;

/*
 * https://www.careercup.com/question?id=5691096052006912
 */

public class BitMask {

	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		int c = 0;
		/*
		 * we are using the BitWise AND as if we convert the values in binary
		 * number 6 will give 00000110 and 1 is 0000001
		 * 
		 * for the number 5 the binary bits are : 00000101
		 * hence the Bitwise and for 5 & 1 will be : 0000001 in decimal =1
		 * and bitwise for 6 & 1 will be : 0000000 in decimal= 0; 
		 * asno common bit is TURNED ON.
		 * 
		 * note: An integer is represented as a sequence of bits in memory. For
		 * interaction with humans, the computer has to display it as decimal
		 * digits, but all the calculations are carried out as binary. 123 in
		 * decimal is stored as 1111011 in memory.
		 * 
		 * The & operator is a bitwise "And". The result is the bits that are
		 * turned on in both numbers. 1001 & 1100 = 1000, since only the first
		 * bit is turned on in both.
		 * 
		 * The | operator is a bitwise "Or". The result is the bits that are
		 * turned on in either of the numbers. 1001 | 1100 = 1101, since only
		 * the second bit from the right is zero in both.
		 */
		b = (a & (2 - 1)); // Either we can use this insted of a%2 or the below
							// one.
		c = a & 1;
		if (c == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is odd");
		}

	}

}
