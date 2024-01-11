package com.study.ch08;

public class TestB01 {

    void add(int[] array, int x, int y) { // 함수 //매개변수로 배열을 받는다
        //System.out.println("x + y = " + (nums[0] + nums[1]));  // 출력까지가
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = x + y;
                break;
            }
        }
    }   // 리턴이 없다면 여기서 만든 배열을 사라졌다.
    void showArrayDates(int[] array ) { // main에서 계속 쓰기 싫어 여기서 쓴다.
        System.out.println("배열 값 확인");

        for(int i = 0; i < array.length; i++) {
            System.out.println("index[" + i + "]" + array[i]);
        }
        System.out.println();
    }
}
