package cn.wbw.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 学生收集器
 *
 * @author hyl
 * @date 2021/3/20 22:31
 */
public class StuCollector<T> implements Collector<T, Set<T>, Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        return null;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        return null;
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
