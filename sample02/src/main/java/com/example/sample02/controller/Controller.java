package com.example.sample02.controller;

import com.example.sample02.dto.MemberDto;
import com.example.sample02.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {

    private final MemberService service;
    public Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/base")
    public String base() {
        logger.info("Hello World!");
        return "base";
    }

    @GetMapping("/conParamGet")
    public String conParamGet (String title) {
        logger.info("HelloController conParamGet");
        logger.info("title: " + title);
        return "link success";
    }

/*
    @GetMapping("/getMember")
    public MemberDto getMember() {
        System.out.println("HelloController getMember()");
        MemberDto dto = new MemberDto("홍길동", "gildong123", "aaa", "aaa@naver.com", 1);

        return dto;
    }*/

    @PostMapping("/getMember")
    public MemberDto getMember(@RequestBody MemberDto mem) {
        logger.info("HelloController getMember()");
        MemberDto dto = new MemberDto("홍길동", "gildong123", "aaa", "aaa@naver.com", 1);
        logger.info(mem.toString());

        return dto;
    }

    @GetMapping("/getMemberList")
    public List<MemberDto> getMemberList(MemberDto dto) {
        logger.info("HelloController getMemberList()");

        List<MemberDto> list = new ArrayList<MemberDto>();
        list.add(new MemberDto("gildong", "gildong123", "aaa", "aaa@naver.com", 1));
        list.add(new MemberDto("chunhyang", "chy122", "bbb", "chy122@naver.com", 3));
        list.add(new MemberDto("hyunjun", "hjunp", "ccc", "hjp12@naver.com", 1));

        logger.info(dto.toString());

        return list;
    }

    @PostMapping("/dbTest")
    public List<MemberDto> dbTest() {
        logger.info("Controller getMember()");
        return service.allMember();
    }

    /*
    @GetMapping("/dbTest")
    public List<MemberDto> dbTest() {
        logger.info("Controller getMember()");
        return service.allMember();
    }
    */

    @GetMapping("/addMember")
    public void addMember(MemberDto dto) {
        logger.info("Controller addMember()");
        service.addMember(dto);
        System.out.println("추가됨");
    }

}
