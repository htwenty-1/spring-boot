package com.hwangduil.springbootbackend.dao;

import com.hwangduil.springbootbackend.dto.BbsDto;
import com.hwangduil.springbootbackend.dto.BbsParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BbsDao {

    List<BbsDto> getBbsList();

    void insertBbs(BbsDto dto);

    BbsDto getBbsDetail(int seq);

    void readcount(int seq);

    List<BbsDto> getBbsListSearch(BbsParam param);

    List<BbsDto> getBbsListSearchPage(BbsParam param);

    int getBbsCount(BbsParam param);

    void bbsAnswer(BbsDto dto);

    int bbsAnswerUpdate(BbsDto dto);

    void bbsUpdate(BbsDto dto);

    int bbsDelete(BbsDto dto);

}
