package com.pedro_marin_sanchis.nomnomnectar.service.order;

import com.pedro_marin_sanchis.nomnomnectar.model.FoodOrder;
import com.pedro_marin_sanchis.nomnomnectar.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<FoodOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<FoodOrder> getOrdersByUserId(Long id) {
        return orderRepository.findByUserId(id);
    }

    @Override
    public Optional<FoodOrder> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public FoodOrder createOrder(FoodOrder order) {
        return orderRepository.save(order);
    }

    @Override
    public FoodOrder updateOrder(Long id, FoodOrder updatedOrder) {
        Optional<FoodOrder> existingOrder = orderRepository.findById(id);

        if (existingOrder.isPresent()) {
            FoodOrder orderToUpdate = existingOrder.get();
            orderToUpdate.setAddress(updatedOrder.getAddress());
            orderToUpdate.setMenu(updatedOrder.getMenu());
            orderToUpdate.setUser(updatedOrder.getUser());
            return orderRepository.save(orderToUpdate);
        } else {
            return null;
        }
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}