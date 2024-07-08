package io.com.github.eduardoconceicao90.junit5_mockito_api.exception;

import io.com.github.eduardoconceicao90.junit5_mockito_api.service.exception.ObjectNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.dao.DataIntegrityViolationException;

class ApplicationControllerAdviceTest {

    @InjectMocks
    private ApplicationControllerAdvice applicationControllerAdvice;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void objectNotFound() {
        ApiErrors response =
                applicationControllerAdvice.objectNotFound(new ObjectNotFoundException("Objeto não encontrado"));

        Assertions.assertNotNull(response);
    }

    @Test
    void handleDataIntegrityViolationException() {
        ApiErrors response =
                applicationControllerAdvice.handleDataIntegrityViolationException(new DataIntegrityViolationException("Email já cadastrado"));

        Assertions.assertNotNull(response);
    }
}