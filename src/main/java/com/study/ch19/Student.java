package com.study.ch19;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
@Data
public class Student { // 빌드업 패턴은 안 보고 할 수 있을 정도로 연습하기!
    private String name;
    private String address;
    private int age;



    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;      //100번 주소
        private String address;
        private int age;


        public StudentBuilder name(String name) {
            this.name = name;
            return this; // newStudentBuilder를 해버리면 새로운 주소인 200이 생겨난다.
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        // 이제 Student return 해주는~
        public Student build() {
            return new Student(name, address, age);
        }
    }


}

