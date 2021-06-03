package cn.wbw.leetcode;

import cn.hutool.core.util.RandomUtil;

/**
 * 选择排序
 *
 * @author hyl
 * @date 2021/4/28 0:30
 */
public class SelectionAlgorithm {
    static int size = 1000000;

    public static void main(String[] args) {
        int[] data = data();
        long second = test1(data);
        System.out.println("消耗时长秒:\t" + second);
    }

    private static long test1(int[] data) {
        long millis = System.currentTimeMillis();
        int index = 0, num = 0;
        for (int i = 0; i < data.length; i++) {
            num = data[i];
            if (i %  100000 == 0) {
                System.out.println("处理:\t" + i);
            }
            for (int j = i; j < data.length; j++) {
                // 查找最小数，交换，退出
                if (data[j] < num) {
                    num = data[j];
                    index = j;
                }
            }
            if (num != data[i]) {
                data[index] = data[i];
                data[i] = num;
            }
        }
        return (System.currentTimeMillis() - millis) / 1000;
    }

    private static int[] data() {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = RandomUtil.randomInt(size);
        }
        return data;
    }

}
