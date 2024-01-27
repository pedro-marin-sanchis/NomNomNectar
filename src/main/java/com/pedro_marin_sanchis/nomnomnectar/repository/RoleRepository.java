package com.pedro_marin_sanchis.nomnomnectar.repository;

import com.pedro_marin_sanchis.nomnomnectar.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getRoleByName(String name);
}