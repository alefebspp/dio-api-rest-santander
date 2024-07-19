package com.dio.desafio.desafio_dio_api_rest.service.impl;

import com.dio.desafio.desafio_dio_api_rest.domain.model.User;
import com.dio.desafio.desafio_dio_api_rest.domain.repository.UserRepository;
import com.dio.desafio.desafio_dio_api_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("User with this account number already exists");
        }

        return userRepository.save(user);
    }
}
