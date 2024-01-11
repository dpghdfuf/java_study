package com.study.ch08.car;

public class CarService {
    CarRepository carRepository; // carRepository 클래스를 클래스는 변수와 OO을 가질 수 있다.

    CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
}

