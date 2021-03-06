package com.yolo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
					.paths(PathSelectors.any())
					.build()
				.apiInfo(apiInfo())
				.tags(new Tag("UserApi","유저 관련 API"),
						new Tag("BoardApi","게시판 관련 API"));
	}
	
	private ApiInfo apiInfo() {

		return new ApiInfo(
                "YOLO REST API"  // Lunchee 대신에 애플리케이션명을 작성 
                , "REST API Document"
                , "1.0.0"
                , "Terms of service"
                , new Contact("yolo", "", "yhhj1592@gmail.com")
                , ""
                , "");
	}
	
	
}

