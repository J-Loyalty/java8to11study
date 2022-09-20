package com.example.java8to11.chapter_2;

public class RunSomething2_Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething2 runSomething = (number) -> number + 10;

        // 동일한 값을 넣었을 때 동일한 결과를 보장해야 함수형 프로그래밍이라고 할 수 있다.
        System.out.println(runSomething.doIt(1));

        /*
            외부에 있는 값을 변경하려는 경우 순수한 함수형 프로그래밍이라고 볼 수 없다.
            주의. Pure Function을 달성하기 위해서는 함수 밖에 있는 값을 참조하거나 변경하면 안된다.

         */
    }
}
