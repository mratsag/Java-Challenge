package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import kodlamaio.northwind.entities.abstracts.BaseEntity;

@Entity
public class Order extends BaseEntity {
    @ManyToOne
    private Card card;

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private int quantity;

    // Getter and setter methods
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
