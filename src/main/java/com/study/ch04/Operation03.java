package com.study.ch04; // 연산자

public class Operation03 {

    public static void main(String[] args) {
        /*
         <<연산자>>

         산술 연산자, 비교연산자, 논리연산자, 조건연산자, 복학대입연산자

         */

        /* 논리 연산자 -> true를 1 false를 0이라 생각하기

        &&(곱) - AND
        ||(합) - OR
        !(부정) - NOT

        * 0이 아니면 true로 생각
        true && false => false  (1 * 0 = 0 )
        true && true => true (1 * 1 = 1)
        true || false => true (1 + 0 = 1)
        false || false => false
        !flase => true




         */


        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0); // 결과 : true
        // 505 % 5 == 0  => 서로 같으니까 true
        System.out.println(505 % 5 == 0 || 505 % 50 == 0); // 결과 : true
        System.out.println(!(505 % 5 == 0 && 505 % 50 != 0));
        //System.out.println(!505 % 5 == 0 && 505 % 50 != 0); -> 에러나오는데?
        int age = 30;
        //System.out.println(40 > age > 20); boolean과 숫자 20은 할 수 없으니~ &&로 표현
        System.out.println(age < 40 && age > 20); // 비교 대상이 앞에 와야한다. 즉, 20 < age라고 X
        System.out.println(age < 40 && age > 20 && age !=30);






    }
}
