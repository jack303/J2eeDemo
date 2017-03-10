package com.hwadee.entity;

import java.util.Date;

public class Comment {
    private Integer cid;

    private Integer aid;

    private Integer wid;

    private String ccontent;

    private Date ctime;

    public Comment(Integer cid, Integer aid, Integer wid, String ccontent, Date ctime) {
        this.cid = cid;
        this.aid = aid;
        this.wid = wid;
        this.ccontent = ccontent;
        this.ctime = ctime;
    }

    public Comment() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent == null ? null : ccontent.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}