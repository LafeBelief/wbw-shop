package cn.wbw.enums;

import java.util.function.Function;

/**
 * @author hyl
 * @date 2021/5/21 0:03
 */
@FunctionalInterface
public interface Fun<T,Z> {

    String aply(Function<T,Z> function);
}
