package com.choice.scm.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linwbai
 * @version $Id: ScmApplication.java, v 0.1 2018-01-16 下午1:41 linwbai Exp $$
 */
@SpringBootApplication
@ComponentScan({"com.choice.scm"})
@ServletComponentScan
@MapperScan("com.choice.scm.dao.mapper")
public class ScmApplication {

    public static ApplicationContext context;

    private static Logger logger = LoggerFactory.getLogger(ScmApplication.class);

    public static void main(String[] args) {
        context = SpringApplication.run(ScmApplication.class, args);
        logger.info("--------启动完成--------");
    }
}
