package com.example.java8to11.chapter_6;

public interface Bar extends Foo {
    // Foo에 있는 Default Method를 사용하고 싶지 않을 경우 추상 메서드로 선언해주면 된다.
    void printNameUpperCase();
}
