package com.dl.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dl.inter.IUser;
import com.dl.mapper.UserMapper;
import com.dl.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserService extends ServiceImpl<UserMapper, User> implements IUser {
}
