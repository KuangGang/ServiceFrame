package com.choice.scm.web.conf;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.choice.scm.dao.conf.DynamicDataSource;
import com.choice.scm.dao.conf.DynamicPlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.UUID;

/**
 * @author linwbai
 * @version $Id: SqlSessionConfig.java, v 0.1 2018-01-16 下午2:27 linwbai Exp $$
 */
@Configuration
public class SqlSessionConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public Properties properties(){
        return new Properties();
    }

    @Bean(name = "dataSourceScmRead")
    @ConfigurationProperties(prefix = "spring.dataSourceScmRead")
    public Properties dataSourceScmRead() throws Exception {
        return new Properties();
    }

    @Bean(name = "dataSourceScmWrite")
    @ConfigurationProperties(prefix = "spring.dataSourceScmWrite")
    public Properties dataSourceScmWrite() throws Exception {
        return new Properties();
    }

    @Bean
    public DataSource dynamicDataSource(Properties dataSourceScmRead, Properties dataSourceScmWrite) throws Exception {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setReadDataSource(DruidDataSourceFactory.createDataSource(dataSourceScmRead));
        dynamicDataSource.setWriteDataSource(DruidDataSourceFactory.createDataSource(dataSourceScmWrite));
        return dynamicDataSource;
    }

    @Bean
    @Scope("prototype")
    @ConfigurationProperties(prefix = "spring.mybatis.configuration")
    public org.apache.ibatis.session.Configuration mybatisConfiguration() {
        return new org.apache.ibatis.session.Configuration();
    }

    private SqlSessionFactory sqlSessionFactoryBean(org.apache.ibatis.session.Configuration mybatisConfiguration, DataSource druidDataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(druidDataSource);
        sqlSessionFactoryBean.setConfiguration(mybatisConfiguration);
//        mybatisConfiguration.getTypeHandlerRegistry().register(UUID.class,ObjectTypeHandler.class);
//        mybatisConfiguration.getTypeHandlerRegistry().register(JsonArray.class,JsonHandler.class);
//        mybatisConfiguration.getTypeHandlerRegistry().register(JsonObject.class,JsonHandler.class);
//        ObjectTypeHandler handler = new ObjectTypeHandler();
//        sqlSessionFactoryBean.setTypeHandlers(new TypeHandler[]{handler});
//        sqlSessionFactoryBean.setTypeHandlersPackage("com.choice.micro.ipos.dao.dao.base");
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.choice.micro.ipos.dao.entity");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mybatis/**/*Mapper.xml"));
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new DynamicPlugin()});
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "sqlSessionFactoryScm")
    @Primary
    public SqlSessionFactory sqlSessionFactoryScm(org.apache.ibatis.session.Configuration mybatisConfiguration, @Qualifier("dynamicDataSource") DataSource dataSourceScm) throws Exception {
        return sqlSessionFactoryBean(mybatisConfiguration, dataSourceScm);
    }
}
