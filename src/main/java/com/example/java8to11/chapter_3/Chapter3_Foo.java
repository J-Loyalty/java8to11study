package com.example.java8to11.chapter_3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chapter3_Foo {
    public static void main(String[] args) {
        // 기존에 사용하던 함수 인터페이스
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));


        // 자바 8에서 제공하는 함수 인터페이스
        // Function<T,R> : T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
        System.out.println("== Function<T, R>");
        Function<Integer, Integer> plus10New = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10New.compose(multiply2).apply(2));  // multiply2를 먼저 수행하고, plus10New를 수행한다.
        System.out.println(plus10New.andThen(multiply2).apply(2));  // plus10New를 먼저 수행하고, multiply2를 수행한다.


        // BIFunction<T,U, R> : T 타입과 U 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
        System.out.println("== BiFunction<T, U, R>");

        // Consumer<T> : T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
        System.out.println("== Consumer<T>");
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        // Supplier<T> : T 타입의 값을 제공하는 함수 인터페이스
        System.out.println("== Supplier<T>");
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        // Predicate<T> : T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
        System.out.println("== Predicate<T>");
        Predicate<String> startWithLoyal = (s) -> s.startsWith("Loyal");
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        // UnaryOperator<T> : Function<T, R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
        System.out.println("== UnaryOperator<T>");

        // BInaryOperator<T> : BIFunction<T, U, R>의 특수한 형태로, 입력값 두개를 받아서 동일한 타입을 리턴하는 함수 인터페이스
        System.out.println("== BInaryOperator<T>");
    }
}
