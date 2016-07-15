package com.sumit.algorithm;

public class EggBreak {

	public int eggBreak(int eggs, int floors) {
		int c;
		int trial[][] = new int[eggs + 1][floors + 1];
		for (int i = 0; i <= floors; i++) {
			trial[1][i] = i;

		}

		for (int e = 2; e <= eggs; e++) {
			for (int f = 1; f <= floors; f++) {
				trial[e][f] = Integer.MAX_VALUE;
				for (int k = 1; k <= f; k++) {
					c = 1 + Math.max(trial[e - 1][k - 1], trial[e][f - k]);
					if (c < trial[e][f]) {
						trial[e][f] = c;
					}
				}
			}
		}
		return trial[eggs][floors];
	}

	/*
	 * easy to use method. Prefer the recursive over the iterative.
	 */
	public int trail(int eggs, int floors) {
		int c = 0;
		// case having 1 egg and n floor
		if (eggs == 1) {
			return floors;
		}
		// case having 0 floors. boundary condition
		if (floors == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		// iterate to all the floors.
		for (int f = 1; f <= floors; f++) {
			/*
			 * set c equals maximun of the first trial is if the egg breaks at
			 * the particular floor so we are left with eggs-1 and floors-1 as
			 * on the previous floor the egg breaks. the second parameter be if
			 * the egg doesnt break at the particular floor so same no of eggs
			 * with floors-1. with each iteration we are taking the min of the
			 * trails.
			 */
			c = 1 + Math.max(trail(eggs - 1, f - 1), trail(eggs, floors - f));
			if (c < min) {
				min = c;
			}
		}

		return min;
	}

	public static void main(String[] args) {
		EggBreak egg = new EggBreak();
		int result = egg.eggBreak(2, 5);
		int result1 = egg.trail(2, 5);
		System.out.println("The Worst Case possible scenario is " + result);
		System.out.println("The Worst Case possible scenario is " + result1);

	}

}
