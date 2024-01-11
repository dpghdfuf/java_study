package com.study.ch10;


public class RemoteController extends ElectronicDevice {
    // abstract class는 생성 X // 생성 할려면 일반 class여야 한다.

    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태 확인");
    }
}
