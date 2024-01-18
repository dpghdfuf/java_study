package com.study.ch07.registor;


public class Product {

    String name;
    String code;
    long price;

    Product(String name, String code, long price) {
        this.name = name;
        this.code = code;
        this.price = price; // ->  이렇게 하면 위의 name, code, price에 값이 들어가는지? ㅇㅇ
    }
}
