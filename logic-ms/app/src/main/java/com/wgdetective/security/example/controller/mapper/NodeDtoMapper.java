package com.wgdetective.security.example.controller.mapper;

import com.wgdetective.security.example.controller.dto.CreateNodeDto;
import com.wgdetective.security.example.controller.dto.NodeDto;
import com.wgdetective.security.example.model.CreateNode;
import com.wgdetective.security.example.model.Node;
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
