package com.you.learn;

import com.you.learn.entity.DataSource;
import com.you.learn.entity.UserEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

/**
 * Created by syou on 2017/11/18.
 */
public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springconfig.class);
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        if(dataSource!=null){
            System.out.println(dataSource.getPassWord()+ " "+dataSource.getUserName());
        }
    }
}
