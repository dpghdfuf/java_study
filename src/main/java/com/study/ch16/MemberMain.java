package com.study.ch16;
import java.util.*;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();   // 여기서 입력을 받음과 동시에 String 타입으로 리턴
    }

    public static Member findMemberByName(String name) {
        // 바로 Member로 찾아갈 수 없으니 members로 주소 찾아감 하지만 귀찮으니 MemberMaind에
        // Main에 있던것을 MamberMain으로 올린다
        for(Member member : members) {
            if(member.getName().equals(name)) {
                findMember = member;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;

        String name = null;
        String address = null;


        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");

            selectedMenu = scanner.nextLine();


            if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                /*
                [ 회원 등록하기 ]
                이름 >> 김준일
                주소 >> 부산 동래구
                << 등록이 완료되었습니다. >>
                 */


                for(int i = 0; i < members.size(); i++ ) {
                    System.out.println("[ 회원 등록하기 ]");
                    System.out.println("이름 >> ");
                    name = scanner.next();
                    System.out.print("이름 >> " + name);
                    System.out.println("주소 >> ");
                    address = scanner.nextLine();
                    System.out.print("주소 >> " + address);
                    System.out.println("<< 등록이 완료되었습니다. >>");
                }

            //    Member member = new Member()




            } else if ("2".equals(selectedMenu)) {
                 /*
                 [ 회원 이름 수정하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준일
                이름 >> 김준이
                << 등록이 완료되었습니다. >>
                  */
                System.out.println("[ 회원 이름 수정하기 ]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세요");
            } else if ("3".equals(selectedMenu)) {
                  /*
                 [ 회원 주소 수정하기 ]
                수정 할 주소의 이름을 입력하세요 >> 김준이
                주소 >> 부산 동래구 사직동
                << 등록이 완료되었습니다. >>
                  */
            } else if ("4".equals(selectedMenu)) {
                /*
                 [ 회원 이름으로 조회하기 ]
                조회 할 회원의 이름을 입력하세요 >> 김준이
                Member 객체 toString();
                << 조회가 완료되었습니다. >>
                */
                String searchName = null;
                System.out.println("[ 회원 이름으로 조회하기 ]");
                searchName = inputSearchName("조회 할 회원의 이름을 입력하세요");
                System.out.print("조회 할 회원의 이름을 입력하세요 >>");
                searchName = scanner.nextLine();
                // 객체 안에 이름이 들어가있기 때문에 indexof로 찾을 수가 없다
                // 전체 반복문 돌려야한다
                Member findMember = null;
                System.out.println();
                    if(member.getName().equals(serarchName)) {
                        findMember = member;
                        break;
                    }
                if(findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println(" << 조회가 완료되었습니다. >> ");

            } else if ("5".equals(selectedMenu)) {
                  /*
                 [ 회원 전체 조회하기 ]
                MemberList 전체 반복 toString(); // 처음에 add 여러개 하기
                << 조회가 완료되었습니다. >>
                  */
                System.out.println("[ 회원 전체 조회하기 ]");
                for(Member member : members) {
                    System.out.println(member);
                }
                System.out.println("조회가 완료되었습니다.");

            } else if ("6".equals(selectedMenu)) {
                   /*
                 [ 회원 이름으로 삭제하기 ]
                삭제 할 회원의 이름을 입력하세요 >> 김준이
                삭제 된 Member 객체 toString();  // 제네릭?리스트 remove를 하고 나면 return 자료형이 금방
                                                // 삭제된 자료형이다
                << 삭제가 완료되었습니다. >>
                  */

                members.remove(findMember); // 주소로 지우는 것 //객체를 바로 지우는 것?
                //members.remove(members.indexOf(findMember)); // 인덱스로 지우는 것
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println("프로그램 종료.");
        }
    }
}

/* <만드는 순서> Create -> R -> Delete -> Update
1.등록 먼저
5.전체 조회
4.이름 조회(부분 조회)
6. 삭제
2.
3.


4번이랑 6번이 findMember가 중복되니 메소드로 빼보고, 삭제할*수정할 이름을~ 이것도 메소드로
빼보자
 */