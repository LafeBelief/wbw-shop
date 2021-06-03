package cn.wbw.stream;

/**
 * @author hyl
 * @date 2021/5/14 11:37
 */
@FunctionalInterface
public interface Func<C, R> {
    String a(C c, R r);
}
