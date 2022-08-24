package com.kazmin.springboot.dao;

import com.kazmin.springboot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    User getUser(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
