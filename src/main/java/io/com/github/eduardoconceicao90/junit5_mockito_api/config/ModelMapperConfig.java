package io.com.github.eduardoconceicao90.junit5_mockito_api.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
