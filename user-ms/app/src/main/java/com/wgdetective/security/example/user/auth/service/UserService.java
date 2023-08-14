package com.wgdetective.security.example.user.auth.service;

import java.util.Optional;

import com.wgdetective.security.example.user.auth.model.User;
import com.wgdetective.security.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Optional<User> findByUserName(final String username) {
        return repository.findByEmail(username);
    }

}
