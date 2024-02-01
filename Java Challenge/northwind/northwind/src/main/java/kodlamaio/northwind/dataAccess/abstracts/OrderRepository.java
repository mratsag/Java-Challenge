package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.northwind.entities.concretes.Order;

import java.util.List;  

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByCode(String orderCode);

    List<Order> findAllByCustomerId(Long customerId);
}
