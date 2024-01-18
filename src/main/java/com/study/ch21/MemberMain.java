package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {   // 메인에서 try catch 미루지 말기
    public static void main(String[] args) throws Exception {
        ArrayList<Member> members = new ArrayList<>();
        members.add(Member.builder().name("김중현").build());
        members.add(Member.builder().name("도경록").build());
        members.add(Member.builder().name("이지연").build());
        members.add(Member.builder().name("이동훈").build());

        MemberService memberService = new MemberServiceImpl();
        memberService.printMemberList(members); // 리스트에 있는 멤버를 통째로 옮겨준다??  // 예외처리 try catch를 여기서 해야한다.(미뤄서
        //메인(우리한테 최상위)까지 오게 됐으)
        // 여기 필기 못함 고치기
        /*
        try {
            memberService.printMemberList(members);
        }
        */

        System.out.println("프로그램 종료");
    }

}
