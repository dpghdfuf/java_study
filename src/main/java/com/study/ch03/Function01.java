package com.study.ch03;
// 함수

public class Function01 {

    // 함수라고 부를 때와 메소드라고 부를 때 구분해보기
    public static void main(String[] args) {
        fx3();
        System.out.println(fx1(1,2,3,4,5)); // 함수 호출, call 이라 한다.
        fx2("김준일");
    }

    // 함수 정의 // 클래스 타입, 함수는 정의한다라고 한다.
    static int fx1(int a, int b, int c, int d, int e) {

        return a + b * c - d * e;  // 값을 돌려주라~
    }

    static void fx2(String name) {
        System.out.println("이름은 " + name + " 입니다.");
    }

    static void fx3() {
        System.out.println(1 + 2 / 1 + 4);
        System.out.println(1 + 2 / 1 + 4);
        System.out.println(1 + 2 / 1 + 4);
        System.out.println(1 + 2 / 1 + 4);
        System.out.println(1 + 2 / 1 + 4);
        System.out.println(1 + 2 / 1 + 4);
    }

}
