package cn.wbw.leetcode;

/**
 * 中位数
 *
 * @author hyl
 * @date 2021/3/31 0:20
 */
public class SolutionMedian {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[0], new int[]{1}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;
            if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {
                right = nums1[aStart++];
            } else {
                right = nums2[bStart++];
            }
        }
        if ((len & 1) == 0) {
            return (left + right) / 2.0;
        } else {
            return right;
        }
    }
}
