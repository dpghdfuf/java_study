package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {   // 메소드 안에서는 무조건 초기화를 해야한다. // main은??
    /*
    기능별로 클래스와 메소드로 분리할 수 있어야만 한다. 분리하는 기준들은
    1. 비즈니스 로직 : 서비스 클래스 ex) 여기서는 비어있는 공간을 확인하는 부분.
    2. 레파직토리(저장소) : 데이터를 관리하는 저장소. ex) 데이터를 가지고 온다.
    정보를 담는 클래스 -> entity
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopflag = true;
        //Car car1 = null;
        //Car car2 = null;
        //Car car3 = null;

        Car[] cars = new Car[3];
        CarRepository carRepository = new CarRepository(cars); // Carsevice안에서 생성되면 결합도가 높아진다.
        //높아지기 때문에 따로따로 생성해서 외부에서 주입한다.
        CarService carService = new CarService(carRepository);
        //carService.carRepository = carRepository; //외부에서 주입이 일어나고 있다.
        // 두개를 따로따로 만들어서

        while(loopflag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료합니다.");
                loopflag = false;
            } else if ("1".equals(selectedMenu)){
                System.out.println("자동차 등록 페이지 ");
                int emptyCount = 0;

                String model = null;
                String color = null;

            // 배열을 가지고오는것 자체 레파지토리를 확인한다.
            // 비어있는 공간을 확인한다 service

            for(int i = 0; i < cars.length; i++){
                if(cars[i] == null){
                    emptyCount++;
                }
            }

            if(emptyCount == 0){
                System.out.println("더이상 등록할 수 없습니다.");
                continue;
            }

            System.out.println("모델명 >>> ");
            model = scanner.nextLine();//entity
            System.out.println("색상 >>> ");
            color = scanner.nextLine();//entity

            /*
            Car car = new Car();   // 이거는 car 클래스로 만들어서 따로따로 넣은거고
            car.model = model;
            car.color = color;
            System.out.println(cars[0].toString());
            */


            //위에 것보단 Car라는 클래스를 생성과 동시에 바로 값을 넣어보자. ->Car에 생성자 만듬과 동시에 ㅇㅇ.
            Car car = new Car(model, color);
            //System.out.println(cars[0].toString());

            for(int i = 0; i < cars.length; i ++) {
                if(cars[i] == null){
                    cars[i] = car;
                    break;
                }
            }

            }else if("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                for(int i = 0; i < cars.length; i ++){
                    System.out.print("["+i+"]>");
                    if(cars[i] == null){
                        System.out.println("x");
                        continue;
                    }
                    System.out.println(cars[i].toString());
                }
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }




}
