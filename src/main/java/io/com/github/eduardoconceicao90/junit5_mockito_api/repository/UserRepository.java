package io.com.github.eduardoconceicao90.junit5_mockito_api.repository;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
