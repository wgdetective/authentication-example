package com.wgdetective.security.example.user.repository.sql;

import java.util.Optional;

import com.wgdetective.security.example.user.repository.sql.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlUserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

}
