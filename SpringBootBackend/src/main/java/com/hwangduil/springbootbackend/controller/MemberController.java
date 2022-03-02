package com.hwangduil.springbootbackend.controller;

import com.hwangduil.springbootbackend.dto.MemberDto;
import com.hwangduil.springbootbackend.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    public final Logger logger = LoggerFactory.getLogger(MemberController.class);

    private final MemberService service;

    @PostMapping("/getId")
    public String getId(MemberDto dto) {
        logger.info("MemberController getId()");
        boolean b = service.getId(dto);
        if(b) {
            return "no";
        }

        return "ok";

    }

    @PostMapping("/addMember")
    public String addMember(MemberDto dto) {
        logger.info("MemberController addMember()");
        boolean b = service.addMember(dto);

        logger.info(dto.toString());

        if(b) {
            return "ok";
        }

        return "no";
    }

    @PostMapping("/login")
    public MemberDto login(MemberDto dto) {
        logger.info("MemberController login()");
        return service.login(dto);
    }

    @PostMapping("/m.login")
    public MemberDto loginM(@RequestBody MemberDto dto) {
        logger.info("MemberController loginMobile()");
        logger.info(service.login(dto).toString());
        return service.login(dto);
    }

    /*
    @PostMapping("/login")
    public MemberDto login(MemberDto dto, HttpServletRequest req) {
        logger.info("MemberController login()");
        MemberDto mem = service.login(dto);
        req.getSession().setAttribute("login", mem);
        return mem;
    }
    */

    @GetMapping("/allMember")
    public List<MemberDto> allMember() {
        logger.info("MemberController allMember()");
        return service.allMember();
    }
}

