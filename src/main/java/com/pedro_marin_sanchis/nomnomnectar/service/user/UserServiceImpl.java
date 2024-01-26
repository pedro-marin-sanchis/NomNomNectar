package com.pedro_marin_sanchis.nomnomnectar.service.user;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;
import com.pedro_marin_sanchis.nomnomnectar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<AppUser> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<AppUser> getUserByUsername(String username) { return userRepository.findByUsername(username); }

    @Override
    public Optional<AppUser> getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return getUserByUsername(username);
    }

    @Override
    public AppUser createUser(AppUser user) {
        return userRepository.save(user);
    }

    @Override
    public AppUser updateUser(Long id, AppUser updatedUser) {
        Optional<AppUser> existingUser = userRepository.findById(id);

        if (existingUser.isPresent()) {
            AppUser userToUpdate = existingUser.get();
            userToUpdate.setUsername(updatedUser.getUsername());
            userToUpdate.setName(updatedUser.getName());
            userToUpdate.setLastName(updatedUser.getLastName());
            userToUpdate.setEmail(updatedUser.getEmail());
            userToUpdate.setPhoneNumber(updatedUser.getPhoneNumber());
            userToUpdate.setOrders(updatedUser.getOrders());
            userToUpdate.setRolesAssociated(updatedUser.getRolesAssociated());
            userToUpdate.setPassword(updatedUser.getPassword());
            return userRepository.save(userToUpdate);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}