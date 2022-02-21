package com.example.sample02.service;

import com.example.sample02.dao.MemberDao;
import com.example.sample02.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberDao dao;

    public List<MemberDto> allMember() {
        return dao.allMember();
    }
}