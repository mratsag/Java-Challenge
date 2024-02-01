package kodlamaio.northwind.business.abstracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.dataAccess.abstracts.OrderRepository;
import kodlamaio.northwind.entities.concretes.Order;

import java.util.List; 

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(Order order) {
        orderRepository.save(order);
    }

    public Order getOrderForCode(String orderCode) {
        return orderRepository.findByCode(orderCode);
    }

    public List<Order> getAllOrdersForCustomer(Long customerId) {
        return orderRepository.findAllByCustomerId(customerId);
    }
}
