package com.study.ch13;

import java.util.Scanner;

public class FactoryService2 {

    private Scanner scanner;

    public FactoryService2(Scanner scanner, Factory factory) {
        this.scanner = scanner;
        //this.factory = factory; -> 쓰는게 맞는지?
    }

    public void create() {
        System.out.println("2공장에서 차량 생산");
        System.out.println("모델명 입력 >>>");
        String modelName = scanner.nextLine();

        Factory factory = Factory.getInstance();   // 아까전의 1번에서 만든 팩토리의 주소를 가져 온다. // 클래스 접근을 어디서나 할 수 있다?
        factory.setFactoryName("자동차 생산 공장");
        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }
}
