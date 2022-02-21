package com.example.sample02.dao;

import com.example.sample02.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberDao {

    // mapper.xml의 id와 함수명이 일치해야함.
    List<MemberDto> allMember();
    void addMember(MemberDto dto);
}