package com.hwangduil.springbootbackend.dao;

import com.hwangduil.springbootbackend.dto.ReplyDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReplyDao {

    void insertReply(ReplyDto dto);
    List<ReplyDto> getReply(int originSeq);

}
