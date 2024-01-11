package com.study.ch10;

public class Laptop implements Power {
    //추상화 하는 이유 : 좀 더 표준화 시킬려고. 유지 보수도 간편해진다.
    @Override
    public void setPowerOn() {

    }

    @Override
    public void setPowerOff() {

    }
}
