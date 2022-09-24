package com.example.java8to11.chapter_6;

public interface Bar2 {

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    // implements로 Foo, Bar2를 선언했을 경우 동일한 default Method가 있을 경우 Compile Exception이 발생한다.
}
