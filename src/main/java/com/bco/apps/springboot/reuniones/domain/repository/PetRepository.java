package com.bco.apps.springboot.reuniones.domain.repository;

import com.bco.apps.springboot.reuniones.domain.entity.PetEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PetRepository extends ReactiveCrudRepository<PetEntity, Long> {
}
