package com.study.ch14;

public class ObjectMain {



    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("예홍렬", "사상구");


        System.out.println(objectTest.toString());
        System.out.println(objectTest);                  // -> 자바만 자동으로 toStirng 없이 호출된다. toStirng없이
        // 멤버들?의 값을 확인하는 것이다.

        ObjectTest objectTest1 = new ObjectTest("예홍렬", "사상구");

        System.out.println(objectTest.equals(objectTest1)); // equals를
        //                   100                  200
        //
        System.out.println(objectTest == objectTest1); // 위의 구문과 같은 내용

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        System.out.println(objectTest.hashCode());   //실제 메모리 주소  // 해시코드는 십진수(리턴값 십진수) 즉, int
        System.out.println(objectTest1.hashCode());  //실제 메모리 주소  // 해시코드는 십진수(리턴값 십진수) 즉, int

        // hashCode는 틀이 달라도 값이 같으면 주소가 달라도 같다라고 보는데
        // hash는 둘 다 같아야지 같다고 보는건가???


    }




}
