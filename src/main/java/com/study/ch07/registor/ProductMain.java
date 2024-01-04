package com.study.ch07.registor;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService();     // 메모리 할당. 중괄호 끝나면 끝남.+++

        Scanner scanner = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0; // 정수 long // int 약 21억 정도


        System.out.println("상품 등록 프로그램");

        System.out.print("상품명>>> ");
        productName = scanner.nextLine();
        if(productService.isEmptyString(productName)) {
            System.out.println("상품명을 다시 입력하세요.");
            return;       // main메소드의 리턴 자료형이 void일 때 사용가능
        }
        System.out.print("상품코드번호(예: P20240000): ");
        productCode = scanner.nextLine();
        if(productService.isEmptyString(productCode)) {
            System.out.println("상품코드번호를 다시 입력하세요.");
            return;
        }
        System.out.print("가격>>> ");
        productPrice = scanner.nextLong();


        Product product = new Product(productName, productCode, productPrice); 
        
        // 안 보고 ch07에다가 패키지에 5개 클래스 만들어서 해보기

        //productService.registerProductService(productName, productCode, productPrice);
        productService.registerProductService(product);
        // 호출을 했으면 다시 되돌아 와야한다
    }
}


// 원래 코드 상으론 끝났는데 아직 프로그램이 소멸되지 않고 안 쓰더라도 남아있다. -> 나중에 jvm 가비지 컬렉터 없앤다
// 대입해서 써야하는데 사용 안하고 있는 메모리가 있으면 -> 가비지 컬렉터가 없애준다.