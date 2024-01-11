package com.study.ch18;

@FunctionalInterface // 메서드 추가할 시에 에러가 남(쓸 일 없음)
public interface Addition {
    public int add(int x, int y);
}
