package com.pedro_marin_sanchis.nomnomnectar.service.role;

import com.pedro_marin_sanchis.nomnomnectar.model.Role;
import com.pedro_marin_sanchis.nomnomnectar.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }
}
