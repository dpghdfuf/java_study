package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {

    @Override
    public void printMemberList(ArrayList<Member> members) throws Exception {
        // 여기서 에러처리 하기 싫어 메인 쪽에서 처리할 예정
        for(int i = 0; i < 5; i++) {  // 4명 넣었는데 5번 반복하니까 에러가 뜰 예정이다.
            System.out.println(members.get(i));
        }
    }
}


