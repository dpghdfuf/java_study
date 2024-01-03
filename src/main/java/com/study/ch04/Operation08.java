package com.study.ch04;

public class Operation08 {
    public static void main(String[] args) {
        /*
        <<문제>>

        복합대입연산(산술연산, 대입연산 합쳐진 것)


         */

        int num1 = 10; //
        int num2 = 20;
        num1 = num1 + num2; // 뒤에서 부터 항상 연산 -> num1 + num2 먼저 계산 후 num1에 대입 "자기자신한테"
        num1 += num2; // 자기자신한테 num2까지 대입해라
        num1 *= num2;
        num1 %= num2; // 꼭 쓸 필요는 없다. 안되는 언어도 있다.

    }
}
