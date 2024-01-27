package com.pedro_marin_sanchis.nomnomnectar.service.role;

import com.pedro_marin_sanchis.nomnomnectar.model.Role;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> getRoleByName(String name);
}
