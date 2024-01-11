package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];    // int 배열 nums에 0, 0, 0이 들어가 있다.
        // 배열의 주소는 nums다.??

        TestB01 bClass = new TestB01(); // new(생성해야지) .add( , )를 사용할 수 있다
        bClass.add(nums, num, num2); // class는 메모리 실재 존재해야지 쓸 수 있다. 생성
        // bClass에서 add라는 함수를 호출해라

        bClass.showArrayDates(nums);

        /*
        클래스(객체) = 변수 + 메소드
        B라는 녀석이 틀로 찍어내면 인스턴스로 생성 되어서 존재해야지 호출 가능
        정의된 것으로만은 호출 안된다

        */
        bClass.add(nums, 20, 40);
        bClass.showArrayDates(nums);


    }
}
//바구니 메인에서 만들어야한다 프로그램이 끝나기 전까지 살아있어야하기 때문이다
//서비스 -> 레파지토리