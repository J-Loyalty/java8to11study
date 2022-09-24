package com.example.java8to11.chapter_6;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo("Jang");
        foo.printName();
        foo.printNameUpperCase();

        // 타입 가지고 Method를 바로 참조할 수 있다. (Static Method)
        Foo.printAnything();
    }
}
