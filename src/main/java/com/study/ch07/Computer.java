package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    Computer() {//변수명과 메소드명은 소문자로 시작해야한다. // new하게되면 무조건 주소를 리턴하기 때문에 리턴을 넣지 않는다.

        //System.out.println("컴퓨터 하나 생성");
        type = "컴퓨터";
    }
    // 생성자 특징
    // 1. 클래스의 이름과 동일하다.
    // 2. 메소드의 형태이다.0
    Computer(String type) { // new하게되면 무조건 주소를 리턴하기 때문에 리턴을 넣지 않는다.

        this.type = type; //
        //System.out.println(type +  " 하나 생성");
    }
    // 생성자 오버로딩 가능하다



    void showInfo() {    // public
    System.out.println("type: " + type);
    System.out.println("cpu: " + cpu);
    System.out.println("ram: " + ram);
    System.out.println("disk: " + disk);
    }
}

/* 필기한거다
class Person{
    String name;
    int age

            Person(String name, int age) {
            this.name = name;   // 우선 순위는 지역변수가 더 높다
            }
            void showInfo() {
            내ㅕㅅ(ㅜ믇);
            sout(age);
            }

            Person p1 = new Person(~)

}
*/