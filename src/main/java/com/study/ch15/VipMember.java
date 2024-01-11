package com.study.ch15;

public class VipMember extends Member {
    private final String GRADE = "VIP";

    public VipMember(String name, String phone) { // Member객체에 올아규가 있고 노아규가 없으니까 VipMember 생성할려면
                                                  // name과 phone도 생성?전달? 해야한다.
        super(name, phone);
    }
}
