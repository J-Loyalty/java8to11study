package com.example.java8to11.chapter_2;

public class RunSomething1_Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
                System.out.println("Lambda");
            }
        };

        runSomething.doIt();

        // Lambda Expressions (한줄)
        RunSomething runSomething2 = () -> System.out.println("Hello Lambda2");
        runSomething2.doIt();

        // Lambda Expressions (여러줄)
        RunSomething runSomething3 = () -> {
            System.out.println("Hello");
            System.out.println("Lambda3");
        };
        runSomething3.doIt();
    }
}
