package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for(int i = 0; i <10; i++) {
            System.out.println("i: " + i);
            if(i % 2 != 0) {
                continue;   // 밑의 반복문 실행시키지 말고 다음 반복으로 넘어가라 // 코드의 가독성의 위해 continue를 실행시키는 경우가 있다.
            }
            System.out.println("for문 마지막");
        }
    }
}
