package com.example.java8to11.chatper_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    /**
     * Chapter 8. Stream API
     * 연속 된 데이터를 처리하는 오퍼레이션들의 모임
     *
     * 중계 Operator : Lazy하다 -> Stream을 Return 한다.
     * 종료 Operator : Stream을 리턴하지 않는다.
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        /*Stream<String> stringStream = names.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);*/

        Stream<String> stringStream = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        });

        System.out.println("================");

        names.forEach(System.out::println);

        System.out.println("================");

        List<String> collect = stringStream.collect(Collectors.toList());

        System.out.println("================");

        collect.forEach(System.out::println);

        /**
         * parallelStream()을 사용하면 spliterator을 사용하여 병렬로 처리해준다.
         * 모든 병렬처리가 속도향상이 된다고는 할 수 없다.
         * 케이스마다 stream과 parallelStream을 비교하여 해야한다.
         */
        System.out.println("================");

        List<String> collect2 = names.parallelStream().map((s -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        })).collect(Collectors.toList());

        collect2.forEach(System.out::println);
    }
}
