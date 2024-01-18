package com.study.ch07.registor;

public class ProductDB {

    void insertProduct(Product product) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("name: " + product.name);
        System.out.println("code: " + product.code);
        System.out.println("price: " + product.price);
        System.out.println();
        // main 메소드 리턴 자료형이 void면 return 사용가능
    }
}
