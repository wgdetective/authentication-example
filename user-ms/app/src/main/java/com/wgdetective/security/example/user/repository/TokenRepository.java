package com.wgdetective.security.example.user.repository;

import java.util.List;
import java.util.Optional;

import com.wgdetective.security.example.user.auth.model.Token;

public interface TokenRepository {

    List<Token> findByUserIdAndExpiredAndRevoked(Long id);

    Optional<Token> findByToken(String token);

    Token save(Token storedToken);

    List<Token> saveAll(List<Token> tokens);

}
