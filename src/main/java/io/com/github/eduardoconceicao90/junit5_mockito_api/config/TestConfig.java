package io.com.github.eduardoconceicao90.junit5_mockito_api.config;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import io.com.github.eduardoconceicao90.junit5_mockito_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile(value = "test")
public class TestConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public void instanciaDB() {
        User u1 = new User(null, "Eduardo", "eduardo@mail.com", "123");
        User u2 = new User(null, "Telma", "telma@mail.com", "123");

        userRepository.saveAll(List.of(u1, u2));
    }
}
