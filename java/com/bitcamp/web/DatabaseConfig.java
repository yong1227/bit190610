package com.bitcamp.web;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * DatabaseConfig
 */

//이것은 설정파일입니다.
@Configuration
//java 구성을 사용하여 스캔한다
@MapperScan(basePackages = "com.bitcamp.web.mapper")
@EnableTransactionManagement
public class DatabaseConfig {

    @Bean
    public SqlSessionFactory name(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //resources의 경로 잡기, resources까지가 classpath
        sessionFactory.setMapperLocations(resolver.getResources("classpath:com/bitcamp/web/mapper/*.xml"));
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sessionTemplate(SqlSessionFactory sqlSessionFactory){
        final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSessionTemplate;
    }
}