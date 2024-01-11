package com.study.ch08.car;

public class CarRepository { // 저장소니까 Car 배열도 가지고 있어야한다. 일단 처음은 배열만.
    final Car[] cars; // 레파지토리 생성될 때 필수다 -> final. 상수는 무조건 초기화가 필요하니까

    CarRepository(Car[] cars) { // 생성배열과 동시에

        this.cars = cars; // 주입이 된다.
    }

    /*
    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;         // 리턴으로 함수자체로 빠져나가기 때문에 break 필요 X
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;   // 비어있는 인덱스를 찾는다


    }


    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;    // return Car배열
    }
    */

}
