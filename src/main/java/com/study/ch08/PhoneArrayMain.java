package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];   // = phone p1, p2 p3 3개 만들어진게 아니라 담을 수 있는 공간 3개
        phones[0] = new Phone("삼성", "갤럭시");
        phones[1] = new Phone("애플", "아이폰");
        phones[2] = new Phone("샤오미", "안보임");

        for(int i = 0; i <  phones.length; i++) {
            System.out.println(phones[i].toString());
        }

    }
}
