package com.study.ch11;

public class Phone {

    static int autoCount = 0;     // 스태틱. 공유되는 영역 -> 밑에서 생성할 때 마다
    int serialNumber;
    Company company;
    // 스태틱은 클래스명에다가 .을 찍으며 접근할 수 있다. 공유할 수 있다가 중요하다.

    public Phone(Company company) {
        autoCount++;
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
