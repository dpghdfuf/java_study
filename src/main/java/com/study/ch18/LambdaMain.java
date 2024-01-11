package com.study.ch18;

import lombok.Data;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Data
public class LambdaMain {
    public static void main(String[] args) {

        Runnable start = () -> {  // 람다식을 사용하게 되면 함수 안에서 함수를 정의할 수 있다. 원래는 못 한다. // Runnable 들어가면 이미 만들어져 있으므로
                                // 굳이 만들 필요 X 변수명만 우리가 마음대로 만들면 된다.
            System.out.println("프로그램 실행"); // 정의
            System.out.println("데이터 초기화");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));

        };
        start.run(); // 메서드니 호출해야지 실행

        Supplier<Integer> supplier1 = () -> 10; // 리턴 생략된것. 주기만 하니까 return, 반환값만 있다.

        int a  = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in); //
        scannerInstance.get().nextLine();  // get이 Scanner를 OO하는 역할로 바뀜

        Consumer<String> setName = name -> {    // consumer 쓰고 말겠다는 말
           String newName = name + "님";
           System.out.println(newName);
        };

        setName.accept("김준일");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str); //  "str -> System.out.println(str)"와 "Consumer<String>"는 객체
        action.accept("김준일");
        //action주소는 str -> System.out.println(str)

        strList.forEach(str -> System.out.println(str) );   // 자료형 Consumer 객체를 넣어야한다. // foreach 매개변수 안에
                     // str 안에 a, b ... 넣으면서 ~
        //arraylist는 OO에서는 반복문, 여기서는 accept


        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        String result = fx1.apply(10);
        System.out.println(result);   // function 개체가 2개가 있으면 내꺼 실행할 떼 after.apply(apply(t));

        String result2 = fx1.andThen(num -> {   // fx1은 num을 제곱하는 녀석
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);
        // 몰라도 된다...??? 하지 말자.
        System.out.println(result2);

        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 19; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);

        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        // 참이면 꺼내서 다른 공간(이것도)에 다시 넣는다. 거짓이면 버린다. 리스트를 카피공간에 넣고, 다시 다른 스트림 공간에 넣는다.
        // Collerctors를 List형으로 바꾼후 스트림을 리스트
        // filter의 자료형은 fredicate이다.
        List<Integer> newList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
        // 위의 리스트를 다시 스트림으로 카피한다?. stream은 반복을 위해서 쓴다. 자료형이 function이 들어간다. 매개변수에 리턴까지 있는게 function인데
        //첫번째 num이 들어와서 2를 곱하면 4인데 새로운 스트림에 넣는다. 다시 4*2 8이 넣는다. 기존 값에다가 2를 곱해서 새로운 것에 넣는다.
        //연산처리를 해준다. 스트림에 있는 것을 리스트로 바꾼후에 새로운 리스트에 넣는다.

        System.out.println(newList);
    }
}
