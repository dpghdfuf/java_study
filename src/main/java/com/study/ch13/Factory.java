package com.study.ch13;

public class Factory {

    private static Factory instance;  // 싱글톤 : 자기자신 클래스를 스태틱 변수(변수명 : instance)로 가지고 있어야한다.
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 20240000;


    private Factory() {   // 생성자는 private으로 외부 생성을 막아준다.

    }

    public static Factory getInstance() {   // 시험칠 때 나온다 // 정보처리기사 나온다.
        if(instance == null) {
            instance = new Factory();        //Factory의 주소를 instance에 넣어준다    // 인스턴스 변수도 스태틱이라
        }
        return instance;                  // 처음엔 null 그 다음에 주소 리턴. 클래스명. (점찍기도 가능)
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }


    public Car produce(String model) {
        autoCount++;
        return new Car((Integer.toString(DEFAULT_NUMBER + autoCount)), model);
    // ("" + (DEFAULT_NUMBER + autoCount), model)
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
