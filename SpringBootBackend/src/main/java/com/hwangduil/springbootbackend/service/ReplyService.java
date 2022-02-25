package com.hwangduil.springbootbackend.service;

import com.hwangduil.springbootbackend.dao.ReplyDao;
import com.hwangduil.springbootbackend.dto.ReplyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReplyService {

    private final ReplyDao dao;

    public void insertReply(ReplyDto dto) {
        dao.insertReply(dto);
    }

    public List<ReplyDto> getReply(int originSeq) {
        return dao.getReply(originSeq);
    }

}
