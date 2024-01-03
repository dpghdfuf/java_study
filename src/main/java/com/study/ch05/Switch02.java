package com.study.ch05;

import java.util.Scanner;

public class Switch02 {

    public static boolean select() {  // 이 함수의 반환자료형, 리턴 자료형은 return 내용
        Scanner scanner = new Scanner(System.in);
        System.out.println("멈출까요?(y/n)? ");
        String value = scanner.next();       // 변수 할당은 한번만 가능하다 따라서 함수로 만들었다?
        return "y".equals(value) || "Y".equals(value);      // true나 false가 리턴된다.
    }
    // 중괄호가 열리고 닫히면 지역이라고 생각
    // 지역 간에는 같은 변수명을 써도 된다. 같은 지역 안에서는 같은 변수명 X
    // 함수명도 마찬가지로 클래스 간에는 같은 함수 바깥 전역 안에서는 같은 함수명 X
    /* 중괄호로 나누는 순간 안에는 지역이 된다. 전역에서 사용되면 지역에서는
    지역에서 정의되면 바깥에서는 못 쓴다.
        중괄호
    닫혀서 쓸 수 없으니까 (버리니까) 다시 쓸 수 있으므로 정의할 수 있다
        열리고 닫히는 중괄호가 메모리에 계속 살아있다 -> 변수명을 쓸 수 없다
            변수명을 쓰고 버리면 다시 쓸수있다. String a = "김준일"처럼
    지역변수와 전역변수에 대한 개념이다
    */

    public static void main(String[] args) {

        int num = 1;



        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                // boolean result = select();
                if(select()) { // if(result)도 가능
                    break;     // break문은 조건문이 아니라 반복문을 빠져나간다.
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()) {
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()) {
                    break;
                }
            case 4:
                System.out.println("4단계 시작");
                if(select()) {
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");
        }


    }
}
