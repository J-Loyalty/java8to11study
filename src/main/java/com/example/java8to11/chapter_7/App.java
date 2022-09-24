package com.example.java8to11.chapter_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("ChoongSeong");
        names.add("Hello");
        names.add("tody");
        names.add("foo");

        /**
         * ForEach
         */

        // Mehtod Reference 방식
        names.forEach(System.out::println);

        for(String name : names) {
            System.out.println(name);
        }

        /**
         * spliterator
         * 쪼갤 수 있는 기능을 가진 Iterator
         * 보통 반으로 쪼갠다.
         */
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        while(spliterator.tryAdvance(System.out::println));
        System.out.println("=================");
        while(spliterator1.tryAdvance(System.out::println));

        /**
         * stream
         */
        long k = names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K"))
                .count();

        System.out.println(k);

        /**
         * removeIf(Predicate)
         * 특정 조건에 만족하는 값을 빼라
         */
        names.removeIf(s -> s.startsWith("k"));
        names.forEach(System.out::println);

        /**
         * reversed()
         */
        names.sort(String::compareToIgnoreCase); // 문자열로 정렬

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed()); // 문자열로 역순으로 정렬

        // thenComparing() 정렬 조건을 하나 더 추가하기

        // 상속은 1개 밖에 되지 않으나, 인터페이스는 여러개 사용이가능하다.
        //

    }
}
