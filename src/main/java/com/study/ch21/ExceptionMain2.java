package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add(null);
        nameList.add("김준사");

        // try catch finally
        try {
            for (int i = 0; i < 5; i++) {          // 예외가 터지면 반복문도 멈춘다.
                String name = nameList.get(i);
                try {

                    if (name.equals("김준사")) {
                        System.out.println("김준사 찾음!!!");
                        break;
                    }
                } catch(NullPointerException e){
                        System.out.println("NullPointerException 발생");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();   // 예외가 뜨지만 프로그램은 정상적으로 종료. 출력해 준 것이다.
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e){    // 마지막엔 꼭 catch (Exception e)
            e.printStackTrace();
        } finally {   // 예외가 발생해서 터지(안 터졌을때도) 실행되는 구문// 임시 저장 같은 기능을 구현할 때 사용하기도 함
            System.out.println("이거는 무조건 실행됨"); // 예외로 터지든 안 터지든 무조건 실행
        }

        System.out.println("프로그램 정상 종료");

    }
}

// 평소에 임시 저장을 활용해보기