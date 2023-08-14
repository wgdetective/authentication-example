package com.wgdetective.security.example.user.repository.mapper;

import com.wgdetective.security.example.model.Node;
import com.wgdetective.security.example.user.repository.entity.NodeEntity;
import org.mapstruct.Mapper;

/**
 * Mapper.
 */
@Mapper(componentModel = "spring")
public interface NodeEntityMapper {

    Node map(final NodeEntity nodeEntity);

    NodeEntity map(final Node nodeEntity);

}
