package LeetProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

/*
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum_1 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();// 数组的长度
		int[] nums = new int[n];// 数组
		for (int i = 0; i < n; i++) {
			nums[i] = cin.nextInt();
		}
		int target = cin.nextInt();// 和
//		twoSum(nums, target);
		int[] res = twoSum(nums, target);
		String resstr = "[";
		System.out.println("[" + res[0] + ", " + res[1] + "]");
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);// 由于数组值唯一，需要获取的是数组的下标，所以数组的值作为key，下标作为value，这样更方便
		}

		for (int i = 0; i < nums.length; i++) {
			int b = target - nums[i];
			if (map.containsKey(b) && map.get(b) != i) {
				int b_index = map.get(b);
				return new int[] { i, b_index };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/*public static void twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			map.put(nums[i], i);// 由于数组值唯一，需要获取的是数组的下标，所以数组的值作为key，下标作为value，这样更方便
		}
		
		for (int i = 0; i < nums.length; i++) {
			int b = target - nums[i];
			if (map.containsKey(b) && map.get(b) > i) {// map.get(b) > i确保结果不重复，不出现[0,1]和[1,0]
				int b_index = map.get(b);
				System.out.println("["+i+", "+b_index+"]");
			}
		}
    }*/
}
