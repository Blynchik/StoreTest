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
                        <br>
                        id - назначается автоматически независимо от введенного значения
                        <br>
                        serialNumber - не должно быть пустым
                        <br>
                        manufacturer - не должно быть пустым
                        <br>
                        price - должно быть  >=0
                        <br>
                        amount - должно быть >=0
                        <br>
                        formFactor - одно из [DESKTOP, NETTOP, MONOBLOCK]
                        <br>
                        hddCapacity - одно из [GB_128, GB_256, GB_512, TB_1, TB_2, TB_4]
                        <br>
                        diagonalInches - целочисленное от 5 до 105(включая)
                        <br>
                        notebookSize - одно из [INCH_13, INCH_14, INCH_15, INCH_17]
                        <br>
                        <b>В ответе будет возвращаться соответсвующее элементу перечисения значение.</b>
                        <br> 
                        <b>Например, для TB_1 - 1024, для INCH_15 - 15</b>
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
