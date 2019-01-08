package com.hntelecom.storm.octopus.mybatis;

import java.math.BigDecimal;

public class Wirerep {
    private Integer id;

    private String address;

    private BigDecimal longtitude;

    private BigDecimal latitude;

    private String des;

    private String otherLAN;

    private String localLAN;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(BigDecimal longtitude) {
        this.longtitude = longtitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getOtherLAN() {
        return otherLAN;
    }

    public void setOtherLAN(String otherLAN) {
        this.otherLAN = otherLAN == null ? null : otherLAN.trim();
    }

    public String getLocalLAN() {
        return localLAN;
    }

    public void setLocalLAN(String localLAN) {
        this.localLAN = localLAN == null ? null : localLAN.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}