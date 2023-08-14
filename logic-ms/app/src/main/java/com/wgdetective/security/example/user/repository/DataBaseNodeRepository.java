package com.wgdetective.security.example.user.repository;

import com.wgdetective.security.example.user.repository.entity.NodeEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Reactive database node repository.
 */
@Repository
public interface DataBaseNodeRepository extends ReactiveCrudRepository<NodeEntity, Long> {

}
