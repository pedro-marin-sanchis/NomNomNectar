package com.pedro_marin_sanchis.nomnomnectar.repository;

import com.pedro_marin_sanchis.nomnomnectar.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<FoodOrder, Long> {
    List<FoodOrder> findByUserId(Long id);
}

