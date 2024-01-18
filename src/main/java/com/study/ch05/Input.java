package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("타이틀: ");
        //String title = scanner.nextLine();

        System.out.print("a: ");
        int a = scanner.nextInt();    // enter 하나당 next 하나 // next 위에 마우스 올려놓으면 String으로 가져오는데 이 때 nextInt를 사용하면 Int로 가져온다
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        /*
        system.out
        scanner.nextLine();

        */

        System.out.println("타이틀: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.println(title + ": " + (a + b + c));
    }
}


// 버퍼는 한번에 처리하기 위해서 쓴다 // 입력도 버퍼를 쓴다.ㅏ
        // 입력도 모아서 해야하기 때문에 버퍼의 끝은 nextLine은 입력도 문자로 본다 중간지점 X
        // 무조건 엔터 입력까지가 입력
        // nextLine()을 제외하고 버퍼의 끝은 엔터이고
        //잘려서 하나하나가 입력
                /*
                즉, nextLine 10 엔터 20 엔터 30엔터 -> 버퍼에 엔터가 남아있는데 그 뒤로 nextLine하면
                nextLine은 엔터 안 먹음??
                next와 nextInt 엔터
                버퍼에 엔터 남아있는데 nextLine을 써버리면 그것을 먹어버린다.
                next는 띄어쓰기가 있으면 입력의 끝으로 본다
                nextLine
                */



        //System.out.println(title + ": " + (a + b + c));

        // next() nextInt() nextDouble() 은 엔터를 안 먹으니까
        // next()는 띄어쓰기가 있으면 입력의 끝으로 본다. ex) a : 10 20 30 결과를 치면
        // 결과로 b: c: 더한 결과: 가 나온다?
        // => scanner.nextLine()을 쓴다.




