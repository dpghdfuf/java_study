package com.study.ch19;


import lombok.Builder;
import lombok.Data;

@Builder
@Data           // 작성하기 전에 @Builder와 @Data 쓰면 끝!
public class Member {

    private String name;
    private String phone;
}
