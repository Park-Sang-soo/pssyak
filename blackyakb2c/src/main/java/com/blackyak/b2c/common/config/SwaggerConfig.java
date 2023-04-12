package com.blackyak.b2c.common.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {
	
	private static final String API_NAME = "BLACKYAK B2C API";
	private static final String API_VERSION = "1.0";
	private static final String API_DESCRIPTION = "자사몰↔ERP REST API";
	
	@Bean
    public Docket SwaggerApi(ServletContext servletContext) {
		
        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(true) // Swagger 에서 제공해주는 기본 응답 코드를 표시할 것이면 true
                .apiInfo(swaggerInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.blackyak.b2c")) // Controller가 들어있는 패키지. 이 경로의 하위에 있는 api만 표시됨.
                .paths(PathSelectors.any()) // 위 패키지 안의 api 중 지정된 path만 보여줌. (any()로 설정 시 모든 api가 보여짐)
                .build();
    }

    public ApiInfo swaggerInfo() {
        return new ApiInfoBuilder()
                .title(API_NAME)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .build();
    }
	
	/*
	private static final String API_NAME = "BLACKYAK B2C API";
	private static final String API_VERSION = "1.0";
	private static final String API_DESCRIPTION = "자사몰↔ERP REST API";

    @Bean
    public Docket SwaggerApi(ServletContext servletContext) {

        return new Docket(DocumentationType.SWAGGER_2)
                    .consumes(getConsumeContentTypes())
                    .produces(getProduceContentTypes())
                    .apiInfo(swaggerInfo())
                    .groupName("Test")
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.blackyak.b2c.product"))
                    .paths(PathSelectors.ant("/**"))
                    .build()
                    .useDefaultResponseMessages(false);
    }

    private Set<String> getConsumeContentTypes() {
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }
    
    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder()
        		    .title(API_NAME)
                    .description(API_DESCRIPTION)
                    .license("API")
                    .licenseUrl("http://localhost:8080")
                    .version(API_VERSION)
                    .build();
      }
      */
}
