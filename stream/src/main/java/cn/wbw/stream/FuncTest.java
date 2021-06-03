package cn.wbw.stream;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author hyl
 * @date 2021/5/14 11:40
 */
public class FuncTest {
    public static void main(String[] args) {
//        GreetingService greetService1 = message -> System.out.println("Hello " + message);
//        greetService1.hello("aaaaaa");
//        Runnable runnable = () -> System.out.println("I am running");
//        runnable.run();
//        new Thread(() -> System.out.println("I am running")).start();
        A a = new A();
//        a.setAa(null);

        String s = Optional.of(a).filter(Objects::nonNull).map(e -> e.aa).orElse("ssssssssssssssss");
        System.out.println(s);


        System.out.println(Optional.ofNullable(null).orElse(new LinkedHashMap<>()));

        Function<String,Integer> function = String::length;
        System.out.println(function.apply("fewgfew"));
    }


    public static class A {
        private String aa;

        public String getAa() {
            return aa;
        }

        public void setAa(String aa) {
            this.aa = aa;
        }
    }
}
