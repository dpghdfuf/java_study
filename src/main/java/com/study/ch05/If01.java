package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문

        int i = 4;

        if(i > 3) {
            System.out.println("i가 3보다 큽니다."); // if(조건문) // 연산의 결과가 아니라서 println함수를 쓸 수 없다 // print 함수를 만들자
            System.out.println("if문 종료");
        } else if(i == 3) {
            System.out.println("i가 3입니다.");
        }
          else {
                System.out.println("i가 3보다 작습니다");
          }

        System.out.println("i가 3보다 크지 않습니다."); // 하나의 명령어줄이면 중괄호 생략가능
        // if else가 하나인 경우 else if가 가능 if, else가 2개 이상인 경우는 else if 불가능
        /* if
           else
           if
           else

         */

        /*
        String tempStr = i>3 ? print("i가 3보다 큽니다.") : ""; // 실행문 둘다 문자열 값이기 때문에 가능
        
        public static String print(String str) {
            System.out.println(str);
            return str;           // 문자열 값을 돌려준다
        }
        
        */
    }
}
