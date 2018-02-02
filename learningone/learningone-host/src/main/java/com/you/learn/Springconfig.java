package com.you.learn;

import com.you.learn.entity.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by syou on 2017/11/18.
 */
@Configuration
@ComponentScan(basePackages = {"com.you.learn"})
@PropertySource(value = {"classpath:config/db.properties"})
public class Springconfig {
    @Value("${userName}")
    private String userName;
    @Value("${passWord}")
    private String passWord;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setPassWord(passWord);
        dataSource.setUserName(userName);
		
		//·µ»ØdataSurce
        return dataSource;
    }

}
