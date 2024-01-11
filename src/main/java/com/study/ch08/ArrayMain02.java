package com.study.ch08;

public class ArrayMain02 {

    public static void main(String[] args) {
        // 배열의 크기는 항상 지정해줘야 한다.
        String[] names = new String[4];
        names[0] = "최수현";
        names[1] = "전주환";
        names[2] = "서창현";
        names[3] = "예홍렬";

        // 숫자가 일정하게 증가하는 for문
        for(int i = 0; i < names.length; i++) { // 자료형의 개수 : names.length
            System.out.println(names[i]);
        }
        // 배열과 반복문은 거의 같이 간다. 무언가가 반복되기 때문에 배열이 필요하기 때문이다.
        // 자료형은 return에 다 쓸 수 있다.
    }
}
