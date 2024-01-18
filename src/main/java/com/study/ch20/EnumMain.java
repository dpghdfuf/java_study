package com.study.ch20;

public class EnumMain {

    public static void main(String[] args) {
        // Status status = new Status(); 대신
        Status status = Status.OK; // 스태틱이랑은 다른 개념. 열거형 개념. // new Status(200, "ok");와 Status.OK와 같다는 개념
        //뭔가 정해져있는 개념을 골라서 사용할 때 쓰는 개념 // 셍성자의 경우를 정해놓고 그때그때 골라서 사용하는 개념
    }
}
