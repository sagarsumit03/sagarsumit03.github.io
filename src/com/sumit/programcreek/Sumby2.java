package com.sumit.programcreek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Sumby2 {
	public static void main(String[] args) {

		int[] arr = {3,11, 15,6,23,5,3};
		Sumby2 sb = new Sumby2();
		System.out.println(Arrays.toString(sb.twoSum(arr, 9)));
	}

	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				System.out.println(map.get(numbers[i]));
				result[0] = index;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		/*Iterator iterate = map.entrySet().iterator();
		while(iterate.hasNext()){
			Entry key = (Entry) iterate.next();
			System.out.println(key.getKey()+" "+key.getValue());
		
		}*/

		return result;
	}
}
