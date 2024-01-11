package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김준일");
        arrayService.add("김준2");
        arrayService.add("김준3");
        arrayService.add("김준4");
        arrayService.add("김준5");
        arrayService.add("김준6");

        System.out.println(arrayService.toString());


        //System.out.println(arrayService.indexOf("김준3"));
        System.out.println(arrayService);
        System.out.println();
    }
}
