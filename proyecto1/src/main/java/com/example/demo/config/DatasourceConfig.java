package com.example.demo.config;

import javax.activation.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DatasourceConfig {


    @Bean
    public DataSource datasource() {
        return (DataSource) DataSourceBuilder.create()
          .driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
          .url("jdbc:sqlserver://localhost;databaseName=Asesores")
          .username("user2")
          .password("123")
          .build();	
    }
    
    

}
