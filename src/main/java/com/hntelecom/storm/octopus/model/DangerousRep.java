package com.hntelecom.storm.octopus.mybatis;

import java.math.BigDecimal;

public class Dangerousrep {
    private Integer id;

    private String repCategory;

    private String address;

    private BigDecimal longtitude;

    private BigDecimal latitude;

    private String telephone;

    private Integer usrId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepCategory() {
        return repCategory;
    }

    public void setRepCategory(String repCategory) {
        this.repCategory = repCategory == null ? null : repCategory.trim();
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }
}