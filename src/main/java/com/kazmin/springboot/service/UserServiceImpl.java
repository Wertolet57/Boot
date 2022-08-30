package com.kazmin.springboot.service;

import com.kazmin.springboot.dao.UserDao;
import com.kazmin.springboot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDAO) {
        this.userDao = userDAO;
    }
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
    @Override
    public void save(User user) {
        userDao.save(user);
    }
    @Override
    public void update(User user) {
        userDao.update(user);
    }
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
