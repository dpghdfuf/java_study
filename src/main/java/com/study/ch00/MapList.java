package com.study.ch00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MapList {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue");
        List<String> sizes = Arrays.asList("SS", "S", "M", "L", "XL");

        Map<String, List<String>> options1 = new HashMap<String, List<String>>();
        options1.put("색상", colors);
        options1.put("색상", colors);
        options1.put("색상", colors);

        Map<String, List<String>> options2 = new HashMap<String, List<String>>();
        options1.put("사이즈", sizes);
        options1.put("사이즈", sizes);
        options1.put("사이즈", sizes);

        for(Map.Entry<String, List<String>> entry : options1.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            System.out.println(key);
            System.out.println(values);
        }
    }
}



