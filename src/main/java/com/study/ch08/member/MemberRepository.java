package com.study.ch08.member;

import java.lang.reflect.Member;

public class MemberRepository {
    int insert(Member member) {
        Member[] members = new Member[3];
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
            System.out.println(members[i]);
        }


        System.out.println("저장소에 Member 저장");
        System.out.println(members.toString());
        // null은 주소가 없다라고도 해석 가능하다.

        // if else 중 else를 최대한 줄이기
        return 0;
    }
}