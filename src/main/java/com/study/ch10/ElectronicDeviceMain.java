package com.study.ch10;



public class ElectronicDeviceMain {
    public static void main(String[] args) {

        new RemoteController();  // 객체(주소)가 만들어지는 것

        // 익명 클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {// ElectronicDevice를 즉시 생성(일회용)
            @Override
            void showDeviceState() {// 굳이 클래스 밖으로 빼서 쓰지 않고 일회용으로 쓸 경우
                // 익명 클래스

                System.out.println("첫번째 기기 상태확인");
            }
        };

        // 익명 클래스
        ElectronicDevice electronicDevice2 = new ElectronicDevice() {// ElectronicDevice를 즉시 생성(일회용)
            @Override
            void showDeviceState() {// 굳이 클래스 밖으로 빼서 쓰지 않고 일회용으로 쓸 경우


                System.out.println("두번째 기기 상태확인");
            }
        };

        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];   // 가능한 이유 : 모두 상속 받았기 때문
        electronicDevices[0] = electronicDevice;  // 업캐스팅
        electronicDevices[1] = electronicDevice2;  // 업캐스팅
        electronicDevices[2] = remoteController; // 업캐스팅

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
