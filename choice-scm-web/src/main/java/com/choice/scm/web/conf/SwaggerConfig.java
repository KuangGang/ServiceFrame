package com.choice.scm.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author linwbai
 * @version $Id: SwaggerConfig.java, v 0.1 2017-07-05 上午10:23 linwbai Exp $$
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.choice.scm.web.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("scm Api")
                .description("供应链api")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
