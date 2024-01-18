package com.study.ch05;
// scanner.nextLine();

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        이름 : 김준일
        나이: 31
        연락처: 01099881916 // 앞의 0은 숫자로 안 나오기 때문에 문자열로~
        학년: 4
        주소: 부산 동래구
         */

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;
        // 변수를 쓸 것이면 위에 다 땡겨서 빈 값을 다 넣어준다. 선언이 중간에 들어가면 안 좋다.

        int x = 0;
        int y = 0;

        System.out.println("x와 y의 값을 입력하시오: (띄어쓰기로 구분)");
        x = scanner.nextInt(); // 띄어쓰기 기준으로 x와 y의 값이 들어간다
        y = scanner.nextInt();


        System.out.print("이름을 입력하세요: ");
        name = scanner.next();                   // next 대신
        System.out.print("나이를 입력하세요: ");
        age = scanner.nextInt();
        System.out.print("연락처를 입력하세요: ");
        phone = scanner.next();
        System.out.print("학년을 입력하세요: ");
        grade = scanner.nextInt();
        System.out.print("주소를 입력하세요: ");
        scanner.nextLine();  // 버퍼 안에 있는 enter 날려주기
        address = scanner.nextLine();  // nextLine이 온다면 그 전에 버퍼 안에 있는 enter를 날려준다. next나 nextInt 다음에 와서

        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("연락처: "+ phone);
        System.out.println("학년: "+ grade);
        System.out.println("주소: "+ address);

        System.out.println("x와 y의 값을 입력하시오: ");





    }
}
