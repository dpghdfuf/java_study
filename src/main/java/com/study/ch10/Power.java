package com.study.ch10;

public interface Power {
    // 추상메서드는 일반 메서드와 추상 메서드도 정의할 수 있다. 일반 메서드와 구조가 동일하고 생성만 안된다.

    // <intereface 특징>
    // 1. interface는 변수 선언이 불가능하다.
    // 2. interface는 모든 메서드가 추상 메서드다.
    // 3. interface는 무조건 상수이다.(바꿀 수 없다.)
    boolean powerState = false; // 상수
    void setPowerOn();
    void setPowerOff();
    String ERROR_CODE = "-9999"; // 상수니까 대문자로

    default void test() {  // 인터페이스는 안 붙이면 추상메서드 default를 붙이면 일반메서드 // 추상클래스는 다중상속안되고 일자로만 내려온다.
        // 인터페이스는 다중상속 가능해서 인터페이스를 추상메서드보다 더 많이 쓴다.
        // 하나의 개체에 여러개의 인터페이스를 넣을 수 있다. '.'을 이용해서 가능. 새로운 형태로 만들어진다, 새로 만들어진다 => 인터페이스

    }
}
