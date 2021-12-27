package com.example.demo.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories(
		basePackages = "com.example.demo", 
		entityManagerFactoryRef = "entityManagerFactory", 
		transactionManagerRef = "transactionManager"
)
public class DatasourceConfig {


    @Bean
    public DataSource datasource() {
        return  DataSourceBuilder.create()
          .driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
          .url("jdbc:sqlserver://localhost:1433;databaseName=Asesores")
          .username("user2")
          .password("123")
          .build();	
        
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
        EntityManagerFactory factory = entityManagerFactory().getObject();
        return new JpaTransactionManager(factory);
    }
    
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    	LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    	factory.setPersistenceUnitName("unidaddePersisteniaPU");
        factory.setDataSource(datasource());
        factory.setPackagesToScan(new String[]{"com.example.demo"});
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties jpaProperties = new Properties();
        factory.setJpaProperties(jpaProperties);
        
        return factory;
        
    }

}
