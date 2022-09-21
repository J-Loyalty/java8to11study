package com.example.java8to11.chapter_4;

import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Chapter4_Foo {

    public static void main(String[] args) {
        /*
            Lambda 표현식
            - 한 줄일 경우 중괄호 없이 사용가능
         */
        Supplier<Integer> get10 = () -> {
            return 10;
        };

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        sum.apply(3, 5);

        Chapter4_Foo foo = new Chapter4_Foo();
        foo.run();
    }

    private void run() {
        /**
         * Lambda의 경우 Local Variable을 변경하지 못한다.
         * 변수가 사실상 Final인 경우 생략할 수 있다. (더이상 변경하지 않는 경우)
         *
         * Local Class와 Anonymous Class의 경우는 동일한 이름의 변수를 재정의할 경우 변수의 값을 재정의한다.
         */
        int baseNumber = 10;

        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }

}
