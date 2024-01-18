package com.study.ch04;
// 증감연산자

public class Operation09 {
    public static void main(String[] args) {
        /*
        << 증감연산자 >>
         */

        int i = 0;
        //i += 1; 파이썬에선 X, 잘 안 쓴다.
        i++; // 2,3씩 증가는 복합증감연산자를 써야한다.
        System.out.println(i);

        int j = 0;
        System.out.println(j++); //뒤에 후증가가 오면
        System.out.println(j); //여기에 선증가가 왔다고 생각하자 like 윗줄을 j 아랫줄을 ++j로 바꿔서 생각

        int k = 0;
        System.out.println(++k);
        System.out.println(k);

        int l = 0;
        System.out.println(l--); // 선은 잘 안 쓰고 후만 쓸 것이다.
        System.out.println(l);

        // 비트 연산은 넘어가기
    }
}
