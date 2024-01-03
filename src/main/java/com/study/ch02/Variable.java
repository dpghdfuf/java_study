package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229; // -> 변수 date는 int라는 4byte 공간을 마련해라. 공간의 이름은 date로~
        // = 기호는 대입기호
        double date2 = (double) date; // 실수는 정수를 포함한다 업캐스팅. 업캐스팅은 당연히 되니 (double) 생략가능
        int data3 = (int)date2; // 다운캐스팅 double 에서 정수는 소수점 자리는 버리고 정수부분만 표현
        // 모든 데이터 형변환은 괄호로 바꿔주기. int로 바꿔라
        // *다운캐스팅 할 때는 괄호 열고 자료형 적어주는 것을 꼭 해야한다

        // 문자 -> 정수 -> 실수  , 문자가 제일 하위 단계  , 업캐스팅
        //
        char a = '1';
        int b = a;
        double c = b;

        System.out.println(date+1);  // sout 사용하기
        System.out.println(date+2);
        System.out.println(date+3);
        System.out.println(date+4);
        System.out.println(date+5);
        System.out.println(date+6);
        System.out.println(date+7);
        System.out.println(date+8);
        System.out.println(date+9);
    }
}
