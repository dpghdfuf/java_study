package com.study.ch15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
public class SendData<T> { // T는 타입을 의미 // 제네릭 여러개 가능 <T, R, E> // 제네릭 타입으로 일반자료형 <int> X
                            // <Integer> 클래스를 써야한다.(대문자로 시작하는 것들로 해야한다.) String,
    private int code;
    private T data;   // 다운캐스팅을 시켜줘야 OO을 쓰는데 대신 제네릭 <T>를 쓰는데 마치 자료형이라 생각, 어떤 타입으로도 가능!



    public void send() { // send(T message), public R send(T message)도 가능...
        System.out.println("데이터 전송 ");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
