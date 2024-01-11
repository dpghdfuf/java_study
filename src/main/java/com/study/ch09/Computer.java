package com.study.ch09;

public class Computer extends ElectronicDevice {    // 자식클래스인 Computer가 생성되면 부모클래스인 ElectronicDevice도 생성
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }
    void showDeviceState() { // 재정의. 오버라이드. // 재정의 : 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의 할 수 있다.
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }



}
