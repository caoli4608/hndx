package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.model.User;

public interface UserDao {

    int deleteUserById(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}