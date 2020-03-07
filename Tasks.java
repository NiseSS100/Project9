package fmi.informatics.hw9;

import fmi.informatics.extending.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {
    public static void task1() {

        Stream.of(Student.StudentGenerator.make(),
                Student.StudentGenerator.make(),
                Student.StudentGenerator.make()
        )
                .filter(s -> s.getName().length() > 4)
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);

    }

    public static void task2() {
        Stream.of("cat", "dog", "cow", "bird")
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void task3() {

        List<Student> studs = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            studs.add(Student.StudentGenerator.make());
        }
        String studNames = studs.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .map(s -> s.getName())
                .reduce((s1, s2) -> {
                    if (s2 != null) return s1 + ", " + s2;
                    return s1;
                })
                .get();
        System.out.println(studNames);
    }

    public static void task4() {
        IntStream.iterate(0, i -> i + 1)
                .skip(5)
                .limit(10)
                .forEach(i -> {
                    if (i % 2 == 0)
                        System.out.println(i);
                });
    }
}
