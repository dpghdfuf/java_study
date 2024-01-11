package com.study.ch12.a;

public class Student {

    private String name;     // 이제부터 변수에는  무조건 private 붙이기
    private String address;

    public Student() {   // default는 같은 폴더(동일한 패키지)에 있어야한다.  // 상속관계일 경우 상관없는 것은 protected?

    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10 , 20));
        System.out.println(add(20 , 30));
        System.out.println(add(40 , 50));
    }

    private int add(int a, int b) {   // 이 클래스 안에서만 쓸 것 같으면 private
        return a + b;
    }
}
