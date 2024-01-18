package com.study.ch07.registor;


public class ProductService {

    boolean isEmptyString(String str) { // 함수다
        if(str == null) {
            return true;           // str이 null이면 true와 함께 리턴한다.
        }
        return str.isBlank();     // null이 아니면 주소 참조가 가능하다
        // isEmpty()는 space바를 비었다고 인식 못함 // isBlank는 빈칸 지우고 검사해줌
        // 비어있지 않아야함. true가 나와야하기 때문에 !(not을 쓴다)
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.print("서비스 까지 데이터 전달함.");

        // 이제 Repository로 가자
        //productRepository.saveProduct(product);
    }

}
