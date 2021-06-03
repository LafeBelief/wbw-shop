package cn.wbw.enums;

/**
 * @author hyl
 * @date 2021/5/10 10:10
 */
public class TestEnums {
    public static void main(String[] args) {
        Out out = Out.common;
        System.out.println(out);
    }
}

enum Out {
    common,
    LEST
}
