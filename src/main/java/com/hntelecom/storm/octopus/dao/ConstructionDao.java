package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.model.Construction;

public interface ConstructionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Construction record);

    int insertSelective(Construction record);

    Construction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Construction record);

    int updateByPrimaryKey(Construction record);
}