package com.study.ch13;

import java.util.Scanner;

public class FactoryService1 {

    private Scanner scanner;



    public FactoryService1(Scanner scanner, Factory factory) {
        this.scanner = scanner;

    }

    public void create() {             // 하나의 팩토리만 만들기
        System.out.println("1공장에서 차량 생산");
        System.out.println("모델명 입력 >>>");
        String modelName = scanner.nextLine();
        Factory factory = Factory.getInstance(); // 100번의 주소를
        factory.setFactoryName("자동차 생산 공장");
        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }
}
