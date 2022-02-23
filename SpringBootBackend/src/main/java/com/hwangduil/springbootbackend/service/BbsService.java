package com.hwangduil.springbootbackend.service;

import com.hwangduil.springbootbackend.dao.BbsDao;
import com.hwangduil.springbootbackend.dto.BbsDto;
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

}
