package com.hwangduil.springbootbackend.controller;

import com.hwangduil.springbootbackend.dto.ReplyDto;
import com.hwangduil.springbootbackend.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReplyController {

    private final Logger logger = LoggerFactory.getLogger(BbsController.class);
    private final ReplyService service;

    @GetMapping("/insertReply")
    public void insertReply(ReplyDto dto) {
        service.insertReply(dto);
    }

    @GetMapping("getReply")
    public List<ReplyDto> getReply(int originSeq) {
        return service.getReply(originSeq);
    }

}
