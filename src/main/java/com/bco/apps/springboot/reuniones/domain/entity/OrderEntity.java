package com.bco.apps.springboot.reuniones.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Table("order")
public class OrderEntity {

    @Id
    private Long id;

    private Long petId;

    private Integer quantity;
}
