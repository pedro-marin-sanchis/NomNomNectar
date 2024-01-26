package com.pedro_marin_sanchis.nomnomnectar.repository;

import com.pedro_marin_sanchis.nomnomnectar.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {}

