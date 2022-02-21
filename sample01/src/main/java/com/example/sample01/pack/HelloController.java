package com.example.sample01.pack;

import com.example.sample01.dto.MemberDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

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

}
