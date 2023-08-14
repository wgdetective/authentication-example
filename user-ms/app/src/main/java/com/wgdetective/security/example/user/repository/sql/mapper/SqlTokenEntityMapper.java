package com.wgdetective.security.example.user.repository.sql.mapper;

import com.wgdetective.security.example.user.auth.model.Token;
import com.wgdetective.security.example.user.repository.sql.entity.TokenEntity;
import org.mapstruct.Mapper;

/**
 * Mapper.
 */
@Mapper(componentModel = "spring")
public interface SqlTokenEntityMapper {

    Token map(final TokenEntity token);

    TokenEntity map(final Token token);

}
