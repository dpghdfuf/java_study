package com.study.ch07.registor;

public class ProductRepository {

    void saveProduct(String name, String code, long price) {  // 매개변수로 받은 값들을 10번째 줄에서 다시 보냄    // 여기 필기 못했다
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스 까지 데이터 전달함.");

        productRepository.saveProduct(name, code, price);

    }
}
