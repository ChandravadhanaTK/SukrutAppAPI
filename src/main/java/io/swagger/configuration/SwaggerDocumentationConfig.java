package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Sukrut App")
            .description("This product is based on the concept of a Treasure Hunt using Geocaching. It aims to provide a one of its kind user experience, promoting an engaging & healthy way to shop for customers, bringing in more footfalls for Merchants thereby increasing their in-store business. ")
            .license("JavaJ2EEFSEWorkshop2")
            .licenseUrl("http://opensource.org/licenses/JavaJ2EEFSEWorkshop2")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "JavaJ2EEFSEWorkshop2@syntelinc.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.sukrut.fsd.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
