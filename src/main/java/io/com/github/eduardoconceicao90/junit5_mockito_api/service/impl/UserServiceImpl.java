package io.com.github.eduardoconceicao90.junit5_mockito_api.service.impl;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.dto.UserDTO;
import io.com.github.eduardoconceicao90.junit5_mockito_api.repository.UserRepository;
import io.com.github.eduardoconceicao90.junit5_mockito_api.service.UserService;
import io.com.github.eduardoconceicao90.junit5_mockito_api.service.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        return userRepository.save(mapper.map(obj, User.class));
    }

}
