package com.wgdetective.security.example.user.controller.dto;

/**
 * Create node request dto.
 *
 * @param parentId parentId
 *
 * @param value value
 */
public record CreateNodeDto(Long parentId, String value) {

}
