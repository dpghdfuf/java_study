package com.study.ch08.car;

public class Car {
    String model;
    String color;

    // NoArgsConstructor
    Car() {

    }

    // AllArgsConstructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //alt + insert 눌러서 toString 항목 누르기
    @Override
    public String toString() {
        return "Car{" +
                // \역슬러시 + ",'   : 역슬러시 뒤에는 문자로 보겠다
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
