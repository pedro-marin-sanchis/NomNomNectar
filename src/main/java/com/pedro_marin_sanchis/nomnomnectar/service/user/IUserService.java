package com.pedro_marin_sanchis.nomnomnectar.service.user;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<AppUser> getAllUsers();
    Optional<AppUser> getUserById(Long id);
    Optional<AppUser> getUserByUsername(String username);
    Optional<AppUser> getCurrentUser();
    AppUser createUser(AppUser user);
    AppUser updateUser(Long id, AppUser updatedUser);
    void deleteUser(Long id);
}
