package com.study.ch07.registor;

import java.util.Scanner;


public class Product {

    String name="김박";
    String code="박김";
    long price=3;

    Product(String name, String code, long price) {
        this.name = name;
        this.code = code;
        this.price = price;                      // ->  이렇게 하면 위의 name, code, price에도 값이 들어가는지?
    }
}
