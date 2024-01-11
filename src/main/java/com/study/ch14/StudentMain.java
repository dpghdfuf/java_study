package com.study.ch14;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("김준일", "01000000000", "동래구", 31 );
        System.out.println(student);

        Student2 student2 = new Student2("김준일", "01000000001", "사상구");
        student2.setPhone("01000000001");
        System.out.println(student2);
        // nonnull vs final
        //중요! 생명주기(life cycle) : 언제부터 언제까지 살 수 있는가 어디서 소멸될건가(생성과 소멸)
    }
}
