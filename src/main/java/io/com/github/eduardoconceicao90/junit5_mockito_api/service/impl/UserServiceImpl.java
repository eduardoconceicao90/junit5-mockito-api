package io.com.github.eduardoconceicao90.junit5_mockito_api.service.impl;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import io.com.github.eduardoconceicao90.junit5_mockito_api.repository.UserRepository;
import io.com.github.eduardoconceicao90.junit5_mockito_api.service.UserService;
import io.com.github.eduardoconceicao90.junit5_mockito_api.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}