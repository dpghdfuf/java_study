package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        // String num = null;

        System.out.print("번호 선택: ");
        num = scanner.nextInt();
        // num = scanner.next();


        switch (num) {
            case 0: //"0":
                System.out.println("0선택");
                break;
            case 1: //"1":
                System.out.println("1선택");
                break;
            case 2: // "2":
                System.out.println("2선택");
                break;
            default:
                System.out.println("오류");


        }


    }
}
// 입력받은 단어 찾아간다 -? 무언가의 목적에 맞게 ~switch   즉, 키워드를 쓴다라고 하면 switch를 쓴다라고 생각(값을 찾아서~)
// 조건문에 의해 참 거짓이  , 수식이 들어가는 것들은 참과 거짓에대한 조건이 들어가면 if문을 사용해야한다
// switch문으로 단어공부하는 프로그램도 만들어볼 수 있다.