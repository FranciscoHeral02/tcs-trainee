package com.bco.apps.springboot.reuniones.domain.repository;


import com.bco.apps.springboot.reuniones.domain.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {
}
