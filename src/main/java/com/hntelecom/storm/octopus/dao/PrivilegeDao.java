package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.mybatis.Privilege;

public interface PrivilegeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}