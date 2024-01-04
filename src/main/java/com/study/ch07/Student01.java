/*package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    //final String address;           // final은 선언과 동시에 초기화가 되어야한다. => 상속이 되어야한다, 값을 가져야한다
//아무런 생성자가 생성되어있지않으면  다른 생성자가 하나라도 생성되면 noargsconstructor 못쓴다.
    //기본생성자는 1개 제공된다. 다른
    // 생성자 constructor
    // 앞으로 args(arguments)를 매개변수 값이라고 할 것이다??

    //밑에 Student01은 매개변수 없으니 NoArgsConstructor라 할 것이다 // 아무것도 안 받아오는 것
   Student01() {

   }

    // 밑에 Student01은 AllArgsConstructor처럼 모두 받아오는 것
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address; //
    }

    // RequiredArgsConstructor  // final, not null 등등 매개변수로 받아오는 것
    Student01(String address) {
        this.address = address;
    }
}
생성자의 종류는 3가지 */