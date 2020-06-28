package com.yusael.dao;

import com.yusael.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {

    // 保存用户
    void save(User user);

    void update(User user);

    void delete(String id);

    List<User> findAll();

    User findById(String id);

}
