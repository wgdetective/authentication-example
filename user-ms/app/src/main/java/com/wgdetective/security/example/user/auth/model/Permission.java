package com.wgdetective.security.example.user.auth.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Permission {

    CREATE("create"), READ("read"), UPDATE("update"), DELETE("delete");

    private final String permission;

}
