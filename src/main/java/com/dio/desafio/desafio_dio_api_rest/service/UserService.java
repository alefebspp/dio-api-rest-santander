package com.dio.desafio.desafio_dio_api_rest.service;

import com.dio.desafio.desafio_dio_api_rest.domain.model.User;

public interface UserService {

    User findUserById(Long id);

    User createUser(User user);
}
