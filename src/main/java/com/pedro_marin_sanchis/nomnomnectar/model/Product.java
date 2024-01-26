package com.pedro_marin_sanchis.nomnomnectar.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int kcal;

    @ManyToOne
    @JoinColumn(name = "product_type")
    private ProductType productType;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String lastName) {
        this.description = lastName;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int phoneNumber) {
        this.kcal = phoneNumber;
    }
}

