package com.hwangduil.springbootbackend.service;

import com.hwangduil.springbootbackend.dao.BbsDao;
import com.hwangduil.springbootbackend.dto.BbsDto;
import com.hwangduil.springbootbackend.dto.BbsParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BbsService {

    private final BbsDao dao;

    public List<BbsDto> getBbsList() {
        return dao.getBbsList();
    }

    public void insertBbs(BbsDto dto) {
        dao.insertBbs(dto);
    }

    public BbsDto getBbsDetail(int seq) {
        return dao.getBbsDetail(seq);
    }

    public void readcount(int seq) {
        dao.readcount(seq);
    }

    public List<BbsDto> getBbsListSearch(BbsParam param) {
        return dao.getBbsListSearch(param);
    }

    public List<BbsDto> getBbsListSearchPage(BbsParam param) {
        return dao.getBbsListSearchPage(param);
    }

    public int getBbsCount(BbsParam param) {
        return dao.getBbsCount(param);
    }

    public void bbsAnswer(BbsDto dto) {
        dao.bbsAnswer(dto);
    }

    public int bbsAnswerUpdate(BbsDto dto) {
        return dao.bbsAnswerUpdate(dto);
    }

    public void bbsUpdate(BbsDto dto) {
        dao.bbsUpdate(dto);
    }

    public int bbsDelete(BbsDto dto) {
        return dao.bbsDelete(dto);
    }

}
