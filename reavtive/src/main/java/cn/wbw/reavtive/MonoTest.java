package cn.wbw.reavtive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author hyl
 * @date 2021/5/27 10:18
 */
public class MonoTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "瓜田李下");
        map.put("age", "20");

        Flux.just(map)
                .flatMap(k -> Flux.just(new Student(k.get("name"), k.get("age"))))
                .map(e -> new Student(e.getName(), e.getAge()))
                .subscribe(System.out::println).dispose();

        Mono.just(null);


    }
}

class Student {
    private String name;

    private Integer age;

    public Student(String name, String age) {
        this.name = name;
        this.age = Integer.valueOf(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}