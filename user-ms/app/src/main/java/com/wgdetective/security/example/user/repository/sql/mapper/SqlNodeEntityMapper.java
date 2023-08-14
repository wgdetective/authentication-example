package com.wgdetective.security.example.user.repository.sql.mapper;

import com.wgdetective.security.example.user.model.Node;
import com.wgdetective.security.example.user.repository.sql.entity.NodeEntity;
import org.mapstruct.Mapper;

/**
 * Mapper.
 */
@Mapper(componentModel = "spring")
public interface SqlNodeEntityMapper {

    Node map(final NodeEntity nodeEntity);

    NodeEntity map(final Node nodeEntity);

}
