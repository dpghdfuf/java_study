package com.study.ch18;

public class AddtionImpl implements Addition {
    @Override // 재정의
    public int add(int x, int y) { // 재정의 할때 매개변수형의 변수명은 상관없다. 자료형이 중요하다.
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return x + y;       // 재정의 할때 매개변수형의 변수명은 상관없다. 자료형이 중요하다.
    }
}
