package com.example.sample01.pack;

import com.example.sample01.dto.MemberDto;
import com.example.sample01.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final MemberService service;

    @GetMapping("/base")
    public String base() {
        System.out.println("HelloController base()");
        return "base";
    }

    @GetMapping("/conParamGet")
    public String conParamGet (String title) {
        System.out.println("HelloController conParamGet");
        System.out.println("title: " + title);
        return "link success";
    }

    @GetMapping("/getMember")
    public MemberDto getMember() {
        System.out.println("HelloController getMember()");
        MemberDto dto = new MemberDto("홍길동", "gildong123", "aaa", "aaa@naver.com", 1);

        return dto;
    }

    @GetMapping("/getMemberList")
    public List<MemberDto> getMemberList() {
        System.out.println("HelloController getMemberList()");
        List<MemberDto> list = new ArrayList<MemberDto>();
        list.add(new MemberDto("gildong", "gildong123", "aaa", "aaa@naver.com", 1));
        list.add(new MemberDto("chunhyang", "chy122", "bbb", "chy122@naver.com", 3));
        list.add(new MemberDto("hyunjun", "hjunp", "ccc", "hjp12@naver.com", 1));

        return list;
    }

    @GetMapping("/dbtest")
    public List<MemberDto> dbTest() {
        System.out.println("HelloController dbTest()");
        return service.allMember();
    }

}
