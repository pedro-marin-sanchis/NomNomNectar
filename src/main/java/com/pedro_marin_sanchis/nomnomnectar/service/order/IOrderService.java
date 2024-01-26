package com.pedro_marin_sanchis.nomnomnectar.service.order;

import com.pedro_marin_sanchis.nomnomnectar.model.FoodOrder;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<FoodOrder> getAllOrders();
    List<FoodOrder> getOrdersByUserId(Long id);
    Optional<FoodOrder> getOrderById(Long id);
    FoodOrder createOrder(FoodOrder order);
    FoodOrder updateOrder(Long id, FoodOrder updatedOrder);
    void deleteOrder(Long id);
}