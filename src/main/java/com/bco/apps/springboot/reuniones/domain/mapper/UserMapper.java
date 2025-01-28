package com.bco.apps.springboot.reuniones.domain.mapper;

import com.bco.apps.springboot.reuniones.domain.dto.User;
import com.bco.apps.springboot.reuniones.domain.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDto(UserEntity user);
}
