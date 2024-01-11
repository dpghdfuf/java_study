package com.study.ch11;

public class SamsungCompany {

    static String name = "삼성"; // static 붙이는 순간 스택 메모리에 저장. // 스태틱은 new를 하더라도 새로운 메모리 공간 만들어지지 않고 공유한다.

    static void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }
}
