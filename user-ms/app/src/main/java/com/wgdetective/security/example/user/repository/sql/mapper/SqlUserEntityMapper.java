package com.wgdetective.security.example.user.repository.sql.mapper;

import com.wgdetective.security.example.user.auth.model.User;
import com.wgdetective.security.example.user.repository.sql.entity.UserEntity;
import org.mapstruct.Mapper;

/**
 * Mapper.
 */
@Mapper(componentModel = "spring", uses = SqlTokenEntityMapper.class)
public interface SqlUserEntityMapper {

    User map(final UserEntity nodeEntity);

    UserEntity map(final User nodeEntity);

}
