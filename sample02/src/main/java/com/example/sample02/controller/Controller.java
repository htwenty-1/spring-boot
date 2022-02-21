package com.example.sample02.controller;

import com.example.sample02.dto.MemberDto;
import com.example.sample02.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final MemberService service;

    @GetMapping("/base")
    public String base() {
        System.out.println("hello world!");
        return "base";
    }

    @GetMapping("/dbTest")
    public List<MemberDto> dbTest() {
        System.out.println("Controller dbTest()");
        List<MemberDto> list = service.allMember();
        return list;
    }

}
