package com.study.ch04;
// 연산자

public class Operation02 {

    public static void main(String[] args) {
        /*
         <<연산자>>

         산술 연산자, 비교연산자, 논리연산자, 조건연산자, 복학대입연산자

         */

        System.out.println(true);    // true, false 자체가 값? 이기 때문에 큰 따옴표로 안 감쌌다
        System.out.println(false);

        boolean flag = 10 > 2;

        System.out.println("비교연산자");
        // true 또는 false가 결과값으로 나온다
        System.out.println(" > " + flag); // 결과는 true로 나오고 1 또는 0 라고는 안 나온다. boolean이라는 자료형으로 나온다
        System.out.println(" < " + ( 10 < 2));
        System.out.println(" >= " + ( 10 >= 10)); // 이상, 이하는 되도록 쓰지말기! 0부터 시작하기 때문에 초과, 미만 되도록 X
        System.out.println(" <= " + ( 10 <= 2));
        System.out.println(" == " + ( 10 == 2 ));
        System.out.println(" != " + ( 10 != 2 )); // !=은 not -> 다르다는 의미(같지 않으면). 10과 2는 다르니 true




    }
}
