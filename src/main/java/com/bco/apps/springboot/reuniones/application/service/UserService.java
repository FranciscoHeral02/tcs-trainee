package com.bco.apps.springboot.reuniones.application.service;

import com.bco.apps.springboot.reuniones.domain.dto.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    public Mono<User> createUser(User user);
    public Mono<User> updateUser(User user);
    public Mono<User> getUser(Long id);
    public Flux<User> getUsers();
    public Flux<User> createUsersWithList(Flux<User> users);
    public void deleteUser(Long id);
}

