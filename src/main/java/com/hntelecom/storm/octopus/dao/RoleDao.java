package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.model.User;

import java.util.List;

public interface UserDao {

    boolean insertUser(User record);

    boolean deleteUserById(Integer id);

    boolean updateUser(User user);

    User getUserById(Integer id);

    List<User> getAllUsers();

}