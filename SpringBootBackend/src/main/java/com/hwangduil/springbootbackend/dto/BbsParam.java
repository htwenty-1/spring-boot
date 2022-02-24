package com.hwangduil.springbootbackend.dto;

import lombok.Getter;

@Getter
public class BbsParam {

    private String choice;
    private String search;

    private int page;   // 페이징을 갱신하기 위해 필요함.

    private int start;
    private int end;

    public BbsParam() {
    }

//    public BbsParam(String choice, String search) {
//        this.choice = choice;   // 제목, 내용, 작성자 중 한 개 항목
//        this.search = search;   // 검색어
//    }

    public BbsParam(String choice, String search, int page, int start, int end) {
        this.choice = choice;
        this.search = search;
        this.page = page;
        this.start = start;
        this.end = end;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }


}
