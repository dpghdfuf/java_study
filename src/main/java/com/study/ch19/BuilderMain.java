package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        //Car car = Car.builder().color("블랙").model("아반떼").build();   // 클래스명.builder()에서 builder()는 스태틱 메소드 // .build();는
        //Car car = Car.CarBuilder().color("블랙").model("아반떼").build(); // car. 점찍어서 접근할 수 있다는 것은 스태틱 메소드라서 그렇다. 근데
        //Car클래스 안에서 CarBuilder가 Car생성자 안에 들어있는 생성자를 호출 한 것이다.
        //System.out.println(car);

        /*
        Car car = new Car("아반떼","블랙");

        Car car2 = new Car();
        car.setModel();

         */

        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        Car car = Car.builder().model("아반떼").color("블랙").build();
    //                100번
        // 100. 주소에 model이 만들어지고 . 찍어서 build 메소드 가능.
        //100.model()
        //100.build()

        System.out.println(car);

        //Member member = Member.builder().phone("00100101").name("김준일").build();
        Member member = Member.builder()
                .phone("00100101")
                .name("김준일")
                .build();

    }
}





