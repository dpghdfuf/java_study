package com.study.ch07;

// 기본적인 클래스 사용법

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer(); // new Computer(); 를 하면 인스턴스가 만들어진다 =>
        // 객체를 생성한다. 인스턴스를 생성한다라고 한다. => 메모리를 할당한다라고도 한다.
        //힙 메모리는 빌리는 메모리 영역
        //스택 메모리 : 프로그램이 실행 중일 때 정해진 메모리다. 정적 메모리다.
        //힙 메모리 : 동적 메모리. new 객체가 생성될 때 동적 메모리할당이다. 다른 언어들도 마찬가지이다.
        Computer computer2 = new Computer("노트북"); // 주소의 개념이 중요하다!!
        //this를 통해 생성할 때 값을 정해줄 수 있다.
        // 실제로는 주소값을 주입하는 것이다.
        // new하게되면 무조건 주소를 리턴하기 때문에 리턴을 넣지 않는다.
        System.out.println(computer1);   // 할당된 메모리, 인스턴스의 주소가 나온다.
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println("computer1.cpu");
        System.out.println("computer2.cpu");
        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram= "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";

    }
}
