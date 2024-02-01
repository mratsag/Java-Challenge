package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Card;

public interface CardRepository extends JpaRepository<Card, Long> {

    Card findByCustomerId(Long customerId);
}

 	