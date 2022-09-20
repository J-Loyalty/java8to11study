package com.example.java8to11.chapter_2;

@FunctionalInterface
public interface RunSomething {
    /*
        함수형 인터페이스 : 추상 메소드가 딱 하나만 가지고 있는 인터페이스 (abstract 생략가능)
     */
    abstract void doIt();

    static void printName() {
        System.out.println("Loyal");
    }

    default void printAge() {
        System.out.println("35");
    }
}
