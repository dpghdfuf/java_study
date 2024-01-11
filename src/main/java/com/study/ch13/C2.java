package com.study.ch13;

public class C2 {

    public void c2(Company company) {  // C2에서 company가 필요한데 D에서도 company가 필요한데
        // C2, D가 같은 company가 되어야할 한다면?

        System.out.println("C2클래스");
        System.out.println(company);
        System.out.println("C2클래스 싱글톤 결과");
        // System.out.println(Company.getInstance()); // 스태틱 메모리에 있는 것을
        // 가져온 것이기 때문에 D클래스 싱글톤 주소와 C2 싱글톤 클래스 주소 같음

        /*
        싱글톤 활용
         1. 유일한 개체를 하나로만 만들어 쓸때
         2. 기능적인 서비스 클래스가 ~??
         */
    }
}