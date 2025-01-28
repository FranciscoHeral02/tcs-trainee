package com.bco.apps.springboot.reuniones.domain.repository;

import com.bco.apps.springboot.reuniones.domain.entity.OrderEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OrderRepository extends ReactiveCrudRepository<OrderEntity, Long> {
}
