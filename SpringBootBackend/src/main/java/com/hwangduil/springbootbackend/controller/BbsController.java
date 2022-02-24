package com.hwangduil.springbootbackend.controller;

import com.hwangduil.springbootbackend.dto.BbsDto;
import com.hwangduil.springbootbackend.dto.BbsParam;
import com.hwangduil.springbootbackend.service.BbsService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BbsController {

    public final Logger logger = LoggerFactory.getLogger(BbsController.class);
    private final BbsService service;

    @GetMapping("/getBbsList")
    public List<BbsDto> getBbsList() {
        logger.info("BbsController getBbsList");
        return service.getBbsList();
    }

    @GetMapping("/insertBbs")
    public void insertBbs(BbsDto dto) {
        logger.info("BbsController insertBbs() ");
        service.insertBbs(dto);
    }

    @GetMapping("/getBbsDetail")
    public BbsDto getBbsDetail(int seq) {
        logger.info("BbsController getBbsDetail()");
        service.readcount(seq);
        return service.getBbsDetail(seq);
    }

    @GetMapping("getBbsListSearch")
    public List<BbsDto> getBbsListSearch(BbsParam param) {
        logger.info("BbsController getBbsListSearch");
        return service.getBbsListSearch(param);
    }

    @GetMapping("/getBbsListSearchPage")
    public List<BbsDto> getBbsListSearchPage(BbsParam param) {
        logger.info("BbsController getBbsListSearchPage");

        // 페이지 설정
        int sn = param.getPage();   // 현재 페이지
        int start = sn * 10 + 1;
        int end = (sn + 1) * 10;

        param.setStart(start);
        param.setEnd(end);

        return service.getBbsListSearchPage(param);
    }

    @GetMapping("/getBbsCount")
    public int getBbsCount(BbsParam param) {
        logger.info("BbsController getBbsCount");
        return service.getBbsCount(param);
    }

    @GetMapping("/bbsAnswerUpdate")
    public String bbsAnswerUpdate(BbsDto dto) {
        logger.info("seq = " + dto.getSeq());
        logger.info("title = " + dto.getTitle());
        logger.info("id = " + dto.getId());
        logger.info("content = " + dto.getContent());

        service.bbsAnswer(dto);
        int result = service.bbsAnswerUpdate(dto);
        if(result > 0) {
            return "fail";
        }
        return "update";
    }

    @GetMapping("bbsUpdate")
    public void bbsUpdate(BbsDto dto) {
        logger.info("BbsController bbsUpdate()");
        service.bbsUpdate(dto);
    }

    @GetMapping("bbsDelete")
    public int bbsDelete(BbsDto dto) {
        logger.info("BbsController bbsDelete()");
        dto.setDel(1);
        return service.bbsDelete(dto);
    }

}
