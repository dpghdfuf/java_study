package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");

    }

    @Override
        // @로 시작하면 어노테이션  // ctrl + O //오버라이드 역할은 재정의하기 위해서
    void showDeviceState() {
        super.showDeviceState();
    }
}
