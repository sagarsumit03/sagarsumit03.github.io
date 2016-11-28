package com.sumit.hackerrank;

/*
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class TestClass {
    public static void main(String args[] ) throws Exception {
    	int arr[] = new int[]{1,2,3,4,5};
    	int rotation = 4;
    	System.out.println(Arrays.toString(printRotation(arr, rotation)));
    	//System.out.println(totalLength("ceaabcdefghijklmnopqrstuvwxyz"));
    }
    
    
    public static int[] printRotation(int arr[], int rotations){
        int arr1[] = new int[arr.length];
        int i=rotations;
        int j=0;
        while(i<arr1.length){
        	arr1[j]=arr[i];
        	i++;
        	j++;
        }
        i= arr.length-rotations;
        j=0;
        System.out.println(i);
        while(i<arr.length){
        	arr1[i]=arr[j];
        	i++;
        	j++;
        }
       return arr1;
    }
}
