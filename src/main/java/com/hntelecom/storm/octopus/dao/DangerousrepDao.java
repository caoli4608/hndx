package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.mybatis.Dangerousrep;

public interface DangerousrepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dangerousrep record);

    int insertSelective(Dangerousrep record);

    Dangerousrep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dangerousrep record);

    int updateByPrimaryKey(Dangerousrep record);
}