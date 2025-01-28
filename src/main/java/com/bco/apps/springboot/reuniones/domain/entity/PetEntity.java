package com.bco.apps.springboot.reuniones.domain.entity;

import com.bco.apps.springboot.reuniones.domain.dto.Category;
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
@Table("pet")
public class PetEntity {

    @Id
    private Long id;

    private String name;

    private Category category;
}
