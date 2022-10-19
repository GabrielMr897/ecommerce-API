package br.org.serratec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("br.com.residencia.controller")).paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    public ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("Trabalho final de API").description("Essa api foi desenvolvida no grupo 2").license("Apache License 2.0").licenseUrl("http://www.apache.org/license").termsOfServiceUrl("/service.html").version("1.0.1").contact(new Contact("Serratec", "www.serratec.org.br", "serratec@serratec.org.br")).build();
        
        return apiInfo;
    }
}
