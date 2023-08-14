package com.wgdetective.security.example.user.auth.service;

import java.util.Optional;

import com.wgdetective.security.example.user.auth.model.Token;
import com.wgdetective.security.example.user.repository.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final TokenRepository repository;

    public Optional<Token> findByToken(final String jwt) {
        return repository.findByToken(jwt);
    }

}
