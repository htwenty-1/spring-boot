package com.hwangduil.springbootbackend.controller;

import com.hwangduil.springbootbackend.dto.BbsDto;
import com.hwangduil.springbootbackend.service.BbsService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BbsController {

    public final Logger logger = LoggerFactory.getLogger(BbsController.class);
    private final BbsService service;

    @GetMapping("/getBbsList")
    public List<BbsDto> getBbsList() {
        logger.info("BbsController getBbsList" + new Date());
        return service.getBbsList();
    }

    @GetMapping("/insertBbs")
    public void insertBbs(BbsDto dto) {
        logger.info("BbsController insertBbs() " + new Date());
        service.insertBbs(dto);
    }

}
