package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1번학생", "김준일"); // key값이 다르다. key값이 다르기 때문에 map.get -> get이 가능하다
        map.put("2번학생", "김준일");
        map.put("3번학생", "김준일");
        map.put("4번학생", "김준일");

        map.put("username", "junil");  // -> 클래스와 비슷하다라고 느껴야한다
        map.put("password", "1234");
        map.put("name", "김준일");
        // map도 마찬가지로 넣을 줄 알고 가져올지 알면 된다. key value 개념으로 값을 넣을줄 알면 된다. map은 put 용도 밖에 잘 안 쓴다
        // 이것만 기억하기 1. map이 key와 value형태로 들어간다. 2. key값으로 vlalue를 꺼낼 수 있다.
        //객체로 바꾸기 애매한데 묶어야하는 경우
        // set은 addall만
        System.out.println(map);
        System.out.println(map.get("email"));



    }
}
