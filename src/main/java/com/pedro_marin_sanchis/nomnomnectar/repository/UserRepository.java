package com.pedro_marin_sanchis.nomnomnectar.repository;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}

