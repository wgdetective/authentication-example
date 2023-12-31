package com.wgdetective.security.example.user.model;

/**
 * Node model.
 *
 * @param id id
 *
 * @param parentId parentId
 *
 * @param value value
 */
public record Node(Long id, Long parentId, String value) {

}
