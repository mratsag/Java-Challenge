package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import kodlamaio.northwind.entities.abstracts.BaseEntity;

@Entity
public class Customer extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToOne
    private Card card;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}