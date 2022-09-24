package com.example.java8to11.chapter_6;

public interface Foo {

    void printName();

    /**
     *  해당 인터페이스를 참조하는 Class에 영향을 끼치지 않고 함수를 사용하고자 할 때 Default Keyword를 사용하면 된다.
     *  오프젝트에서 제공하는 Method는 Default Method에서 재정의해서 사용할 수 없다.
     */

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    static void printAnything() {
        System.out.println("Foo");
    }
}
