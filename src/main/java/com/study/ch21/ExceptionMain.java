package com.study.ch21;

// 예외 처리
public class ExceptionMain {
    public static void main(String[] args) {

        int[] numArray = new int[] {1,2,3,4,5};

        for(int i = 0; i < 6; i++) {
            try {
            System.out.println(numArray[i]);
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException은 catch의 매개변수
                // 예외 처리 안하면 중간에 튕긴다.
                System.out.println("예외 발생");
            }
        System.out.println("프로그램 종료");

    }
}
}
// 예외가(오류?) 떴을 때 처리할 수 있어야한다.

//어떤 파일을 불러와야하거나 인터넷을 연결해야하거나 -> 즉, 입력장치와 아웃장치가 없으면 IOException,

/*
1. 컴파일 되기 전부터 오류인 경우
2. 실행된 이후로 오류인 경우  RuntimeException 실행하다가 오류난 경우 (내가 잘못 짜서)
*/