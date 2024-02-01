package kodlamaio.northwind.entities.concretes;

import java.util.*;

import jakarta.persistence.*;
import kodlamaio.northwind.entities.abstracts.BaseEntity;

@Entity
public class Card extends BaseEntity {
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}