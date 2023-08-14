package com.wgdetective.security.example.user.repository.sql.entity;

import com.wgdetective.security.example.user.auth.model.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "UserEntity")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
