package com.yusael.service;

import com.yusael.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    void delete(String id);

    List<User> findAll();

    User finById(String id);
}
