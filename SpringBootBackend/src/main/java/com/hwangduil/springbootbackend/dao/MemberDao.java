package com.hwangduil.springbootbackend.dao;

import com.hwangduil.springbootbackend.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberDao {

    List<MemberDto> allMember();
    int getId(MemberDto dto);
    int addMember(MemberDto dto);
    MemberDto login(MemberDto dto);

}