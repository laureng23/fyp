package com.finalProject.school.dao;

import java.util.List;

import com.finalProject.school.model.User;
 
 
public interface UserDao {
 
    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();
 
}