package com.you.learn.repository.impl;

import com.you.learn.entity.UserEntity;
import com.you.learn.repository.UserDao;
import org.springframework.stereotype.Component;

/**
 * Created by syou on 2017/7/4.
 */
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public UserEntity getUser() {
        UserEntity user=new UserEntity();
        user.setName("shan");
        user.setId(1);
        return user;
    }
}
