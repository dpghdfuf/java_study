package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {

        StudentType student = new StudentType();


        student.name = "홍길동가";
        student.grade = 1;
        student.address = "부산진구";

        System.out.println(student.name);
        System.out.println(student.grade);
        System.out.println(student.address);

        int a = 10;
        double b = a;

        //Person p = junil; -> p에는 person이 더 넓으니 student를 포함하고 있으니 업캐스팅 가능 // (Person이 부모 클래스 StudentType이 자식 클래스인 상태)
        //StudentType junil2 = (StudentType) p; // 다운캐스팅은 반드시 명시적 형 변환이 일어나야한다
        // 자료형의 포함 관계를 알고 있어야한다. 업*다운 캐스팅 알고 있어야한다.

        //Person 전주환 = new Person();
        // StudentType 전주환학생 = (StudentType) 전주환; -> 요건 안됨

        // person이 더 넓은 영역
        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;





        // person 이름(name)과 나이(age) 밖에 없음 변수명 p라 하면 (new했으니)  // (Person이 부모 클래스 StudentType이 자식 클래스인 상태)
        // StudentType 이름 나이 학년 주소
        /* p(person)을 student로 변환 했을 때 StudentType 로 X
                Student를 person으로 했을 때 업캐스팅 됐다가 다운 캐스팅 괜찮다
                new는 메모리를 할당했을 때 쓰는것이다

         */

    }
}
