package com.store.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Store API documentation",
                version = "1.0",
                description = """
                        <p><b>Simple API for computer store</b>
                        """,
                contact = @Contact(url = "https://github.com/Blynchik", name = "Vadim Sovetnikov", email = "vadimsovetnikov@mail.ru"))
)
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("Store API")
                .pathsToMatch("/api/**")
                .build();
    }
}
