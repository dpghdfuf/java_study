package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag1 = true;


        while(flag1) {  // while은 조건이 중심 // for문은 횟수나 범위가 정해져있을 때 // true는 바꿀 수 없는 리터럴 상수?이다.
            System.out.print("1번에서 입력: ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag1 = false; // flag 한번 실행하고 멈춤, break는 바로 멈춘다    // 바깥의 조건까지 멈추고 싶으면 flag를 사용
                // 안쪽 while과 바깥쪽 while 다 멈춘다.
            } else if (inputValue == 1) {
                System.out.println("1번으로 돌아왔습니다.");
                boolean flag2 = true;
                while(flag2) {
                    System.out.print("1번에서 입력: ");
                    inputValue = scanner.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag1 = false;
                        flag2 = false;
                    } else if(inputValue == 2) {
                        System.out.println("2번으로 돌아왔습니다.");
                    }
                }
            }
                    else{
                        System.out.println("다시 입력하세요.");
            }
        }

    }
}
// 보통 break보단 flag를 쓴다. */

