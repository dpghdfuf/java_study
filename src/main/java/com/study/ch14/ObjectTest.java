package com.study.ch14;

import java.util.Objects;

public class ObjectTest {
    private String name;
    private String address;

    /* 중요
    Object 클래스 (깊이까진 ㄴㄴ)

     */

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public ObjectTest() {
    }



    // 1번째 if문 주소가 같으
    @Override                   // 2번째 주소가 다른데 한 쪽이 다르거나 if문에서 this.getClass()문이다. 서로 다른 클래스로 만들어졌거나(패키지가 다르거나)
                                // 3번째 object를 모든 객체는 object를 상속 받았다. 모두 엄캐스팅 가능하니 업캐스팅 되어서 매개번수로 들어왔고 지금은
                                // 다운캐스팅 한거다. 기존의 클래스에서 s가 붙으면 계산, 비교, 값을 찾아준다거나 모아둔 도구 메소드들은
    //                          // 클래스이름.스태틱메소드으로 쓰임. ex_ objects.equals()
                                // return문은 주소가 다르더라도 안에 값이 같으면 같다라고 하는 구문임
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    public static void main(String[] args) {
        // 오버라이드 ->
        // 자바에선 모든 클래스는 Object클래스를 상속 받고 있다. 예외 X



        /*
        Object o = new Object();    // 보통 외부에서 가져오면 import를 해야하는데 Object나 String, println은 안하네
        // Object 타고 들어가보면 get 클래스, 해시코드, equals, toString에 대해 알아볼 예정
        //this == obj 주소 비교???
        String str = new String(); // 그 기준은 왼쪽에 외부 라이브러리 안에 java.base 안에 lang안에 보면 있다
        // java.util안에 Scanner가 있다. -> 선언해야한다?
        */



        //public class objectTest extends Student    // 부모인 Student도 Object 상속 받고 있다.





    }
}
