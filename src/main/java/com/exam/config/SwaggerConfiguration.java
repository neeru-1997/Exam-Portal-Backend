package com.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket examportalAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.exam"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("Exam Portal API")
                .version("1.0")
                .description("API Documentation of Exam Portal Application")
                .contact(new Contact("Neeraj Vishwakarma", "https://www.linkedin.com/in/neeraj-vishwakarma-2b33a7138/", "neeraj-vishwakarma@hotmail.com"))
                .license("Apache License Version 2.0")
                .build();
    }
}
