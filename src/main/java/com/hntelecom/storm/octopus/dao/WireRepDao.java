package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.model.Wirerep;

public interface WirerepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wirerep record);

    int insertSelective(Wirerep record);

    Wirerep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wirerep record);

    int updateByPrimaryKey(Wirerep record);
}