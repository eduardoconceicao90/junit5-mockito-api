package io.com.github.eduardoconceicao90.junit5_mockito_api.repository;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
