package com.example.java8to11.chapter_5;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Chapter5_Foo {

    public static void main(String[] args) {

        // Static Method의 경우
        UnaryOperator<String> hi = Greeting::hi;
        String jang = hi.apply("Jang");
        System.out.println(jang);

        // Static Method가 아닌 경우
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        hello.apply("Loyal");

        // 입력값은 없는데, 결과값은 있는 경우
        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        String[] names = {"Jang", "Choong", "Seong"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
