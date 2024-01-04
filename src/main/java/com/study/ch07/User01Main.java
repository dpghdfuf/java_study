package com.study.ch07;



public class User01Main {

    public static void main(String[] args) {
        User01 user1 = new User01("aaa", "1234");
        User01 user2 = new User01("bbb", "1234", "김준이", "sk@hanmail.net");

        user1.showInfo();
        System.out.println("--------------------------------");

        user2.showInfo();
        System.out.println("--------------------------------");

        user1.setName("김준일");
        user1.setEmail("sk@hanmail.net");

        user1.showInfo();


    }
}






