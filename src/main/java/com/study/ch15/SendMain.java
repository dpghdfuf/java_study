package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
/*        SendData<String> sendData1= new SendData<>(200, "예홍렬"); // 앞에서 데이터타입을 정의했으니 뒤에서 생성될 때 생략 가능
    //    send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("예홍렬", "0100000000")); // 둘 중 하나
        send(sendData2);
        // 틀이 2개다. 다른 자료형이다.
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("예홍렬", "01000000000"));
        send(sendData3);
    }


    public static void send(SendData<? extends Member> sendData) { // <?> 제네릭의 와일드 카드. <String>이 올지 <Member>가 올지 모르겠다.
                                                    // 둘 다 출력된다.? -> 확인해보기
                                                    // SendData<? extends Member> sendData -> 와일드 카드에서 상속 제한을
                                                    // 걸어버리면 Member에게 상속을 받거나 Member여야한다.
        // void에 (SendData<?> sendData)도 된다
        sendData.send();
    }

    public static void send(SendData<? super VipMember> sendData) { // VipMember와 부모만 가능하다
        sendData.send();
    }
    // 와일드 카드 일단 잊어버리고 클래스를 하나 만드는데 이 클래스의 멤버변수들의 타입이 변할 수 있다. -> 제네릭을 먼저 이해하는게
    //중요하다

 */
    }
}


