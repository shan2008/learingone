package com.you.learn;

import com.you.learn.entity.UserEntity;
import com.you.learn.repository.UserDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by syou on 2017/11/18.
 */
@Service
public class UserServiceImpl  implements UserService{
    private final UserDao userDao;

    @Inject
    public  UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public UserEntity getUser() {
        return userDao.getUser();
    }
}
