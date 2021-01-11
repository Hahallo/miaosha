package com.example.demo.service;

import com.example.demo.error.BusinessException;
import com.example.demo.service.model.UserModel;

public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    //telphone：用户注册手机
    //passowrd：用户加密好的密码
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
