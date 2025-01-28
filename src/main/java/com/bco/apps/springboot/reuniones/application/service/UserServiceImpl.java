package com.bco.apps.springboot.reuniones.application.service;

import com.bco.apps.springboot.reuniones.domain.dto.User;
import com.bco.apps.springboot.reuniones.domain.mapper.UserMapper;
import com.bco.apps.springboot.reuniones.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(userMapper.toEntity(user)).map(userMapper::toDto);
    }

    @Override
    public Mono<User> updateUser(User user) {
        return userRepository.save(userMapper.toEntity(user)).map(userMapper::toDto);
    }

    @Override
    public Mono<User> getUser(Long id) {
        return userRepository.findById(id).map(userMapper::toDto);
    }

    @Override
    public Flux<User> getUsers() {
        return userRepository.findAll().map(userMapper::toDto);
    }

    @Override
    public Flux<User> createUsersWithList(Flux<User> users) {
        return userRepository.saveAll(users.map(userMapper::toEntity)).map(userMapper::toDto);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
