package com.study.ch03;
// 함수, 매개변수

public class Function02 {


    // 매개변수x, 리턴x
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
        // int age, String name 쓸 수 있다. 밑에 fx02 변수와 다른 지역이기 때문.
    }

    public static void fx02(int age, String name) { // 중간에서 매개역할을 하므로 매개변수라 한다. // 똑같은 함수명이라도 매개변수가 다르면 다른 함수라 한다. but 자료형은
        //같고 변수명만 다르게 하면 안된다. 즉, 변수명은 상관없고 자료형만 상관있다.
        // 지역변수이기 때문에 int age 매개변수 age는 쓸 수 없다.
        // 여기서 int age, String name 선언 못함 같은 지역이기 때문
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();

    }
    // 매소드의 오버로딩 : 매소드(함수)명이 같지만, 매개변수의 자료형이 다르면 새로운 함수정의가 가능하다.(vs 오버라이딩 구분하기)
    // 리턴 자료형이 다르다고 오버로딩이 되지 않는다. 오버로딩은 (함수명이 같고) 매개변수가(매개변수의 자료형이) 달라야한다.
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100; // 함수 실행 후 돌려줄 값
    }

    public static String fx04(String name, int age) {
        return name + ", "  + age;
    }

    public static void main(String[] args) {
        fx01();    // 프로그램 시작은 항상 main // fx01()함수 호출
        fx02(32, "김준일");
        fx02("김준일", 32);
        int num = fx03(); // 값 100이다.
        System.out.println(fx03()); // fx03() 실행하고 return값 까지 출력한다!!??
        String result = fx04("김준일", 32);
        System.out.println(result);
    }

    // 여기까지 함수의 뼈대를 다 공부했다. 이제 응용을 하면 된다.
}
