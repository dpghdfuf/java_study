package com.study.ch04;
// 조건연산자(삼항연산자)

public class Operation06 {
    public static void main(String[] args) {

        /*
        <<문제>>

        조건연산자(삼항연산자)

        a > 0 ? "양수" : a == 0 ? "0" : "음수"; => 양수도 아니고 0도 아니면 음수이다.
          a>0 ? 참 : 거짓
       먼저 '?'를 보면 a가 0보다 크면 true 아니면 false인지를 물어보는 '?'이다
       참이면 결과 ""양수"라는 문자열을 줄 것이다. ㅇ지금 우리가 배우는 연산자는 무조건 결과가 나온다.
       :(콜론)을 기준으로 참이면 앞 뒤는 a 인데 a== 0이 참인지 물어보고 참이면 ~ 거짓이면~


        */

        /*
        String sResult = 10 > 2 ? "1111" + 1 : "2222"; // 연산자는 결과가 있다는 것을 꼭 기억, 연산자 안에 연산자를 또 쓸 수 있다.
        // 결과값이 1111, 2222이기 때문에 sResult의
        //결과값들의 자료형의 일치가 매우 중요하다. print문을 쓸 수 없으며 쓰고 싶다면 if문을 쓰자
        boolean bResult = 10 > 2;   // boolean bResult = 10 > 2 ? true : false; 라고 쓰지 말자
        데이터 통신에서 null값을 받을 수가 없기 때문에 대문자 Boolean을 쓴다.
        null까지 받을려면 Integer,
        */

        int iResult = 10 > 2 ? 1111 : 2222;

        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        Boolean bResult = 10 > 2;

        Boolean.parseBoolean("true");

        String name = null;
        System.out.println(name == null);
        System.out.println(name == null);
        System.out.println("테스트 코드 작성");


    }


}
