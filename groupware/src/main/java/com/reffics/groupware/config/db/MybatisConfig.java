package com.reffics.groupware.config.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.reffics.**.mapper")
@RequiredArgsConstructor
public class MybatisConfig {

    private final ApplicationContext applicationContext;

    @Bean
    @ConfigurationProperties(prefix = "reffics.database")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource getDataSource(HikariConfig hikariConfig) {
        // TODO: 2022/03/22 yml properties value 복호화 처리
        return new HikariDataSource(hikariConfig);
    }

    @Bean
    public SqlSessionFactory getSqlSessionFactory(final DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:mappers/mapper/**/*_SQL.xml"));
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mappers/config/mybatis-config.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate getSqlSessionTemplate(final SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
