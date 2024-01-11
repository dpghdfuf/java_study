package com.study.ch00;

public class Test00Main {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        Test00 test00 = new Test00();
        test00.fx(a, b);

        System.out.println("main에서의 a의 값: " + a + " main에서의 b의 값: " + b);
    }
}
