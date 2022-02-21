package com.example.sample02.dto;

import lombok.Getter;

@Getter
public class MemberDto {

    private String id;
    private String pwd;
    private String name;
    private String email;
    private int auth;

    public MemberDto() {
    }

    public MemberDto(String id, String pwd, String name, String email, int auth) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.auth = auth;
    }

}