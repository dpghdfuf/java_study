package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
        <<문제>>

        연도가 주어졌을 때, 윤년이면 true, 아니면 false을 출력하는 프로그램을 작성하시오.

        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
        1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
        하지만, 2000년은 400의 배수이기 때문에 윤년이다

        연도는 0보다 크고, 4001보다 작은 자연수이다.

        int year = 2000; => 결과 true
        int year - 19999; -> 결과 false
         */

        // 1-1
        int year=0;
        boolean result;

        result = ( year > 0 && year < 4001) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ));
        System.out.println(result);


        // 1-2

        int year2=2000;
        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4= year % 100 != 0;
        boolean step5 = year % 400 == 0; ;

        boolean result2 = step1 && step2 && (step3 && step4 || step5);
        System.out.println(result2);

        String name = ""; // 문자열이 없는 것은 맞지만 값이 없는 건 아니다 공백이라는 값을 가진다 . 변수의 값이 비었ㄷ는 null로 표현
        // String name2 = null;
        // null은 주소가 없다, 메모리 주소의 0번 -> 아예 없는 공간이다
        System.out.println(name);

        // 값이 없다라고 하는 경우 숫자는 0, 문자열이 비었다 "" -> 공백 name이라는 변수가 비었다는



    }
}
