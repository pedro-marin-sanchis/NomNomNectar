package com.pedro_marin_sanchis.nomnomnectar.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

    @ManyToMany(mappedBy = "rolesAssociated", fetch = FetchType.LAZY)
    private Set<AppUser> usersAssociated = new LinkedHashSet<>();

    public Set<AppUser> getUsersAssociated() {
        return usersAssociated;
    }

    public void setUsersAssociated(Set<AppUser> usersAssociated) {
        this.usersAssociated = usersAssociated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}