package io.com.github.eduardoconceicao90.junit5_mockito_api.service;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;

public interface UserService {

    User findById(Integer id);

}
