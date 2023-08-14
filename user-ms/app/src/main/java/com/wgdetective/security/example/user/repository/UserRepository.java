package com.wgdetective.security.example.user.repository;

import java.util.Optional;

import com.wgdetective.security.example.user.auth.model.User;

public interface UserRepository {

    Optional<User> findByEmail(String email);

    User save(User user);

}
