package com.kazmin.springboot.service;

import com.kazmin.springboot.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
