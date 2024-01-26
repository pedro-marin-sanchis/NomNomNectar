package com.pedro_marin_sanchis.nomnomnectar.service.user;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {
    private final AppUser appUser;

    public CustomUserDetails(AppUser appUser) {
        this.appUser = appUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return appUser.getRolesAssociated().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return appUser.getPassword();
    }

    @Override
    public String getUsername() {
        return appUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // TODO: Condition not comtemplated for this app.
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // TODO: Condition not comtemplated for this app.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // TODO: Condition not comtemplated for this app.
    }

    @Override
    public boolean isEnabled() {
        return true; // TODO: Condition not comtemplated for this app.
    }
}