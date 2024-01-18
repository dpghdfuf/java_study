package com.study.ch06;
// 반복문 : for와 while

public class For01 {
    public static void main(String[] args) {
       // System.out.println(i++);
       // System.out.println(i);
        for(int i = 0; i < 10; i++ ) {  // for(초기화문; 조건문; 증가 or 감소(후처리문))
            // 반복문은 항상 내가 반복횟수를 생각해야한다 조건문에 어느 숫자를 넣을지 고민하는게 아니다.
            System.out.println("i: " + i); // 초기화문 -> 조건문 -> 실행문 -> 후처리문까지 i = 0 -> 조건문에서 i=1 -> 실행문 ->
            //for(int i = 0, j = 0; i < 10; i++, j++) 가능하지만 쓸일 없다.
        }
        int i = 0;   // while은 i를 미리 정의해야한다.
        while(i < 10) {                 //
            System.out.println("i: " + i);
            i++;
        }
    }
}
//for는 반복횟수가 정해져있고 일정한 간격으로 증가시켜야할 때. 조건이 중심이 아니라 반복횟수가 중심이다. 0 1 2 3 4 5 6 7 일정하게 숫자가 증가할때. 반복횟수가 필요할 때.
// for문은 횟수나 범위가 정해져있을 때.
//while은 반복횟수가 중심이 아니라 조건이 중심이다. 조건이 먼저 필요할 때, if가 떠오를 때.
// 즉, for문은 횟수 while문은 조건
