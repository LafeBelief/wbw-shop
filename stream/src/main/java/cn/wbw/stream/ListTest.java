package cn.wbw.stream;

import java.util.stream.Stream;

/**
 * @author hyl
 * @date 2021/5/26 17:53
 */
public class ListTest {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).sum();
        System.out.println(sum);
    }
}
