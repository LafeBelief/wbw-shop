package cn.wbw.leetcode;

import java.util.*;

/**
 * @author hyl
 * @date 2021/3/29 23:44
 */
public class ArraysDelRepetition {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        removeDuplicates3(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            nums[i] = (int) obj[i];
        }
        return set.size();
    }

    public static int removeDuplicates2(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (!list.contains(val)) {
                list.add(val);
                nums[index++] = val;
            }
        }
        return list.size();
    }

    public static int removeDuplicates3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}
