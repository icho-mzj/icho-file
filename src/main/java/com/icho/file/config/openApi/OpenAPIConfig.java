package com.icho.file.config.openApi;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: icho
 * @Date: 2022/6/26 18:38
 * @Describe:
 */
@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI fileOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Icho网盘 API")
                        .description("基于Spring Boot 2 + VUE CLI@3框架开发的分布式文件管理系统。")
                        .version("v1.0")
                        .license(new License().name("MIT").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                );

    }
}
