package com.hwangduil.springbootbackend.dao;

import com.hwangduil.springbootbackend.dto.BbsDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BbsDao {

    List<BbsDto> getBbsList();
    void insertBbs(BbsDto dto);

}
