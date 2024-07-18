package com.dio.desafio.desafio_dio_api_rest.domain.repository;

import com.dio.desafio.desafio_dio_api_rest.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
