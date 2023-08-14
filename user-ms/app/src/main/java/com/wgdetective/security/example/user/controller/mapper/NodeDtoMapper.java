package com.wgdetective.security.example.user.controller.mapper;

import com.wgdetective.security.example.user.controller.dto.CreateNodeDto;
import com.wgdetective.security.example.user.controller.dto.NodeDto;
import com.wgdetective.security.example.user.model.CreateNode;
import com.wgdetective.security.example.user.model.Node;
import org.mapstruct.Mapper;

/**
 * Mapper.
 */
@Mapper(componentModel = "spring")
public interface NodeDtoMapper {

    NodeDto map(Node node);

    Node map(NodeDto node);

    CreateNode map(CreateNodeDto node);

}
