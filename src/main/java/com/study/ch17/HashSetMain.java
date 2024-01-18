package com.study.ch17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;


public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");
        /*
        HashSet<String> names = new HashSet<>();  // 순서가 있는 이유는 HashSet이 있기 때문
        names.add("김준일");
        // get은 순서가 없으니까 없다. index관련도 없다. 그냥 순서가 관련된 것은 다 없다.
        names.add("김준이");
        names.add("김준삼");
        names.add("김준사");
        */

        System.out.println(nameList);

        //HashtSet<String> names = new HashSet<>();
        //names.addAll(nameList); // 스트링에서 상속받은 녀석들은 다 들어올 수 있다. //addAll -> 다 옮길 수 있다.

        // set은 for문 돌려야한다.
        /*
        for(int i = 0; i < names.size(); i++) {
            names.get
        }
        */  //index 참조로 값을 못 꺼낸다. 따라서
/*
        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });
        System.out.println(newNameList);

        String findName = null;

        for(String name : names) {    // set은 중복 제거용으로 쓴다.
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }

        System.out.println(findName);
    }
}

*/
    }
}