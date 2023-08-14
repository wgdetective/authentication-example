package com.wgdetective.security.example.user.repository;

import java.util.List;
import java.util.Optional;

import com.wgdetective.security.example.user.model.Node;

/**
 * NodeRepository interface.
 */
public interface NodeRepository {

    Optional<Node> findById(Long id);

    List<Node> findAll();

    Node save(Node node);

    void deleteById(Long id);

}
