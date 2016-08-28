package com.sumit.leetcode;

/*
 * 

I find this a bit tricky to explain, 
but here's an attempt; think bit by bit addition, there are only 4 cases;

0+0=0 
0+1=1 
1+0=1 
1+1=0 (and generates carry)
The two lines handle different cases

sum = a ^ b
Handles case 0+1 and 1+0, sum will contain the simple case, 
all bit positions that add up to 1.

carry = (a & b) << 1
The (a & b) part finds all bit positions with the case 1+1. 
Since the addition results in 0, it's the carry that's important, 
and it's shifted to the next position to the left (<<1). The carry needs to be added to that position, so the algorithm runs again.

The algorithm repeats until there are no more carries, in which case sum will contain the correct result.

Btw, return sum should be return a, then both sum and carry could be regular local variables
 */

public class BitwiseAddition {

	public static void main(String[] args) {
		int a =6;
		int b =3;
		while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        System.out.println(a);

	}

}
