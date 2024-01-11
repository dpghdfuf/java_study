package com.study.ch14;


import lombok.*;    // *은 전체

@AllArgsConstructor
@RequiredArgsConstructor // 필수 argument 생성
@Data     // getter setter 는 private. toString은 값을 알 수 있으니 필수
public class Student2 {
    private final String name;
    private String address;
    @NonNull      // lombok이다   // nonnull은 null만 아니면 된다. vs final은 상수이기 때문에 값을 바꿀수 없다. -> final은
                                 // setter가 없다
    private String phone;
}
