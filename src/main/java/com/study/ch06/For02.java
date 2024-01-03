package com.study.ch06;

public class For02 {
    public static void main(String[] args) {

        /*
        0, 1, 2, 3, 4
        5, 6, 7, 8, 9

        4, 3, 2, 1, 0
         */
        int i = 0;
        int j = 0;

        for(i = 0 ; i < 10; i++) {
            if (i==0 || i==5) System.out.print(" " + i);
            else System.out.print(", " + i);
            if (i==4) System.out.println();
        }

        /*
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i % 5 != 4) {
                System.out.println(", ")
            }
            if(i % 5 == 4) {
                System.out.println();
            }
        }
         */
        int n = 5;
        for(i = 0; i < n; i++) {       // n 자리는 반복횟수다 바꾸지말고 문제 풀기 꼭 기억해야한다.
            int result = n - 1 -i;    // n - 1 - i를 꼭 기억하기, -1 해주는 이유 알기
            System.out.print(result);
            if(result % 5 != 0) System.out.println(", ");
            if(result % 5 == 0) System.out.println();

        }
    }

}




