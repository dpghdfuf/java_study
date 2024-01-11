package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;      // requireargs랑 같이 쓸 수 없다.
import lombok.Setter;   // ??

import java.lang.annotation.Target;

@NoArgsConstructor    // 매개변수 없는것
@AllArgsConstructor   // 모든 매개변수를 가지는 것
@Data                    // @Setter @Getter @EqualsAndHashCode @ToString  4개를 모은 것

public class Student {

    private String name;
    private String phone;
    private String address;
    private int age;

}
