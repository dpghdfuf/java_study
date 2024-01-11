package com.study.ch18;



public class AdditionMain {
    public static void main(String[] args) {
        // 익명 클래스 // 이름이 없을 뿐이지 이름이 없다 뿐이지
        Addition addition = new Addition() { // 생성 할 수 없는 개체를 생성하려면 1. 익명클래스로 만들기 2. implements 메소드를 overide 해주기
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };  // 객체 값이기 때문에 끝에 ;를 붙인다.

        Addition addition2 =  new AddtionImpl();

        System.out.println(addition.add(10, 20));
        System.out.println(addition2.add(30, 40));

        // 람다식 핵심조건 : 인터페이스 안에 딱 하나의 추상메소드가 정의되어 있어야한다!
        // 단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.
        Addition addtion3 = (int x , int y) -> { // 추상메소드가 1개 밖에 없으니 화살표를 add함수로 바꾼것이라 생각하면 된다.
            System.out.println("람다식으로 구현한 add메소드");  // 생성과 동시에 값 대입 // add메소드로 재?정의 한 것이다.
            return x + y;
        };

        System.out.println(addtion3.add(50, 60));

        // 1. 람다시의 매개변수 자료형은 생략할 수 있다. 변수명은 상관없이 사용가능
        Addition addition4 = (x , y) -> {
            return x + y;
        };

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 중괄호를 생략할 수 있다.
        // 단, return은 중괄호를 생략할 시에 같이 생략한다.
        Addition addition5 = (x, y) -> x + y;     // x + y 자체로 리턴값이 된다.(int형)
        Viewer viewer = (viewData) -> {
            System.out.println("화면 출력");
        };
        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        // 3. 매개변수가 1개면 매개변수의 괄호도 생략할 수 있다. (매개변수를 감싸는)
        Viewer viewer3 = viewData -> System.out.println("화면 출력");

        //=> 인터페이스 안에 추상 메서드가 1개가 있어야한다!!!!(중요!!)






    }

}
