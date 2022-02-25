package com.hwangduil.springbootbackend.dto;

import lombok.Getter;

@Getter
public class ReplyDto {

    private int seq;
    private String id;
    private String content;
    private String wdate;
    private int originSeq;

    public ReplyDto() {
    }

    public ReplyDto(int seq, String id, String content, String wdate, int originSeq) {
        this.seq = seq;
        this.id = id;
        this.content = content;
        this.wdate = wdate;
        this.originSeq = originSeq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWdate(String wdate) {
        this.wdate = wdate;
    }

    public void setOriginSeq(int originSeq) {
        this.originSeq = originSeq;
    }

    @Override
    public String toString() {
        return "ReplyDto{" +
                "seq=" + seq +
                ", id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", wdate='" + wdate + '\'' +
                ", originSeq=" + originSeq +
                '}';
    }
}
