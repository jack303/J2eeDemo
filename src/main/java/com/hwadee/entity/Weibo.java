package com.hwadee.entity;

import java.util.Date;

public class Weibo {
    private Integer wid;

    private Integer aid;

    private String wcontent;

    private Date lastUpdateTime;

    private String service;

    private Integer liked;

    private Integer comment;

    public Weibo(Integer wid, Integer aid, String wcontent, Date lastUpdateTime, String service, Integer liked, Integer comment) {
        this.wid = wid;
        this.aid = aid;
        this.wcontent = wcontent;
        this.lastUpdateTime = lastUpdateTime;
        this.service = service;
        this.liked = liked;
        this.comment = comment;
    }

    public Weibo() {
        super();
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent == null ? null : wcontent.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }
}