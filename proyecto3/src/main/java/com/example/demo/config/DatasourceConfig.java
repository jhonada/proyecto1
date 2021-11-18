package com.example.demo.config;

import javax.activation.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

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
