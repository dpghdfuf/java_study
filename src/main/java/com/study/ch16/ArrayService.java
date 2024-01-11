package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;    //

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 실행될 때마다 공간+1인 배열을 새로 만든다?
        for(int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];             // 값 옮기고
        }
        strArray = newArray;                      // 대입해주고?
        strArray[strArray.length - 1] = str;
    }

    public void remove(int index) {
        // 기준보다 크기가 1작은 배열을 새로 만든다
        // 매개변수로 받은 인덱스의 값을 기준으로 작은 index들은 그대로 옮기고 큰 인덱스들은 -1하여 옮긴다
        // strArray의 배열을 새로운 배열로 바꾼다.
        String[] newArray = new String[strArray.length - 1];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1];
        }
        strArray = newArray;
    }

    public String get(int index) {
        return strArray[index];
    }

    /*
    public String indexOf(String str) {  // 앞에서 처음부터 만나는 인덱스를 뽑아준다. // 탐색이라 한다.
        if(str == null) {
            return -1;
        }
        // 일단 처음은 선형탐색(처음부터 끝까지 쫙 탐색)
        for(int i = 0; i< strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }

        return -1;
    }
    */

    @Override
    public String  toString() {
        String result = "Array[ ";

        for(int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }

        }

        result += " ]";

        return result;

    }
}
