package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import kodlamaio.northwind.entities.abstracts.BaseEntity;

@Entity
public class Product extends BaseEntity{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int stock;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
