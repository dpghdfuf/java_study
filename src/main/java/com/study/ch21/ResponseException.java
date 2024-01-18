package com.study.ch21;


import lombok.Getter;

import java.util.Map;

@Getter
public class ResponseException extends RuntimeException {  // Exception이 붙은 클래스는 예외와 관련된 클래스다
    // 우리만의 예외들도 런타임익셉션 활용해서 만든다.

    private Map<String, Object> errorMap;

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);   // 부모 개체 생성. 런타임 익셉션도 생성된다.
        this.errorMap = errorMap;
    }
}
