package cn.wbw.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 *
 * @author hyl
 * @date 2021/3/23 22:07
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int ta = target - nums[i];
            if (map.containsKey(ta)) {
                return new int[]{i, map.get(ta)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 14, 34, 45, 4, 312, 32, 354, 67};
        int[] sum = twoSum3(a, 66);
        System.out.println(Arrays.toString(sum));
        System.out.println((a[sum[0]] + a[sum[1]]));
    }
}