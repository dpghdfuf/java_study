package com.study.ch19;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car {
    private String model;
    private String color;

    //public Car

    public static CarBuilder builder() { // 호출하면
        // 리턴 자료형 CarBuilder
        //Car car = new Car();
        return new Car.CarBuilder(); // 생성되고
    }
    //Car.bilder(). -> 대강
    // 스태틱에서 스태틱을 호출하는 것은 가능하다. -> ??
    public static class CarBuilder { // 호출하면
        private String model;

        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this; // this는 자기 자신의 주소 // this 자체가 주소?
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this; // this는 자기 자신의 주소 // this 자체가 주소?
        }
        // 100.model().color()
        //     100.     100.
        // 현재 CarBuilder가 데이터 가지고 있는데 이것들을 Car를 생성할 때 값들을 넣어주면 된다. Car는 생성자 올아규가 있어야한다.

    }



    /*
    // 기본 생성자를 가지고 있고 // 메인문에서 생성후에 set하면 되지만
    public Car() {

    }

    public Car(String model, String color) { // alt + insert 후 생성자
        this.model = model;
        this.color = color;
    }
    */

}



