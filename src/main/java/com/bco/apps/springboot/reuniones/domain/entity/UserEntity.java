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
@Table("user")
public class UserEntity {

    @Id
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phone;

    private Integer userStatus;
}
