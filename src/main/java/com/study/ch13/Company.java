package com.study.ch13;

public class Company {
    private String name;

    /*
    Company 클래스를 싱글톤을 적용하여 구현하시요
     */
/*
    public class Company {
        // 스태틱 변수로 자기 자신을 저장할 수 있어야한다
        private static Company instance;
        private String name;    // 신경쓰지 말기

        private Company() {}  //생성자와 게터 있으면 싱글톤

        public static Company getInstance() {
            if(instance == null) {
                instance = new Company();
            }
            return instance;
        }


    }
*/
}
