package io.com.github.eduardoconceicao90.junit5_mockito_api.controller;

import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.User;
import io.com.github.eduardoconceicao90.junit5_mockito_api.domain.dto.UserDTO;
import io.com.github.eduardoconceicao90.junit5_mockito_api.service.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class UserControllerTest {

    public static final int ID = 1;
    public static final String NAME = "Eduardo";
    public static final String EMAIL = "eduardo@mail.com";
    public static final String PASSWORD = "123";

    @InjectMocks
    private UserController userController;

    @Mock
    private UserServiceImpl userService;

    @Mock
    private ModelMapper mapper;

    private User user;
    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}