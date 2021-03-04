package com.luv2code.com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2  //don;t do this in production
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {

		//return a prepared Docket instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select() //get a docket builder
				.paths(PathSelectors.ant("/api/*")) //only document the "/api/" apis
				.apis(RequestHandlerSelectors.basePackage("com.luv2code.com")) //select the base package
				.build()
				//insert your app specific data
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Address book API",
				"Sample API for JavaBrains tutorial",
				"1.O",
				"Free to use",
				new springfox.documentation.service.Contact("Melvin Kimathi", "http://melvinkim.io", "a@ab.com"),
				"API licence",
				"http://javabrains.io",
				Collections.emptyList()
		);
	}

}
