package com.wgdetective.security.example.user.repository.sql;

import java.util.Optional;

import com.wgdetective.security.example.user.auth.model.User;
import com.wgdetective.security.example.user.repository.UserRepository;
import com.wgdetective.security.example.user.repository.sql.mapper.SqlUserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SqlUserRepositoryWrapper implements UserRepository {

    private final SqlUserRepository repository;

    private final SqlUserEntityMapper mapper;

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email).map(mapper::map);
    }

    @Override
    public User save(final User user) {
        return mapper.map(repository.save(mapper.map(user)));
    }

}
