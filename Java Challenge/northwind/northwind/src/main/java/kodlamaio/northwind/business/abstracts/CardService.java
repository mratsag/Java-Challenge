package kodlamaio.northwind.business.abstracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.northwind.dataAccess.abstracts.CardRepository;
import kodlamaio.northwind.entities.concretes.Card;

@Service
public class CardService {
    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card getCardByCustomerId(Long customerId) {
        return cardRepository.findByCustomerId(customerId);
    }

    public void updateCard(Card card) {
        cardRepository.save(card);
    }

    public void emptyCard(Long cardId) {
        Card card = cardRepository.findById(cardId).orElse(null);
        if (card != null) {
            card.getOrders().clear();
            cardRepository.save(card);
        }
    }

	public void updateCart(Card card) {
		
	}
}

