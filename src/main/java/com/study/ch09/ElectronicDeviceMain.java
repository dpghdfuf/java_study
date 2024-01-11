package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone(); // 둘다 상속 받았으니 업캐스팅해서 집어넣을 수 있다.
            // 부모와 동일하게 교집합을 가지고 있는 것은 사용가능하나 자식일 때 가지고 있던 것들은 사용 불가능하다?
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();

        }
        /*
        System.out.println();

        for(int i = 0; i < computers.length; i++) {
            computers[i].setPowerOn();
        }

        for(int i = 0; i < computers.length; i++) {
            computers[i].setPowerOn();
        }
        */



        /*
        SmartPhone smartPhone = new SmartPhone();

        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.showDeviceState();               // 업캐스팅을 했는데 부모가 쓸 수 있는것을 쓸 수 있다.
        smartPhone.showDeviceState();
        ElectronicDevice electronicDevice2 = smartPhone;



        for(int i = 0; i < computers.length; i++) {
            computers[i].setPowerOn();
        }
        */   //여기까지 업캐스팅 가능하다는 것을 보여주기 위해

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        // 업캐스팅 하기전에 원래 무엇이었는지 아는 방법(아래것)  // 자바 17에서 instanceof 사라짐.
        for(int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof  Computer) {  // 컴퓨터로 인스턴스가 만들어졌니? true가 나와야지 다운캐스팅 가능 -> 이후로 호출.
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }



    }
}
