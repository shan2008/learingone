package com.you.learn;

import com.ctrip.ibu.platform.shark.sdk.api.Shark;
import com.ctrip.ibu.platform.shark.sdk.service.SharkInitializer;
import com.you.learn.entity.DataSource;
import com.you.learn.entity.UserEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

/**
 * Created by syou on 2017/11/18.
 */
public class APP {
    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springconfig.class);
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        if(dataSource!=null){
			//test
            System.out.println(dataSource.getPassWord()+ " "+dataSource.getUserName());
        }*/


        try {
            SharkInitializer.init();
            Shark.initThreadLocale("en-HK");
            String a = Shark.get(100024873, "key.test", "en-HK", "fail");
            System.out.println(a);
        } catch (Exception e) {

            System.out.println(e);
        }





    }
}
