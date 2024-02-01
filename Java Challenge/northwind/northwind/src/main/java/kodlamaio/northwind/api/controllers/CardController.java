package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlamaio.northwind.business.abstracts.CardService;
import kodlamaio.northwind.entities.concretes.Card;

@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private CardService cardService;
    
    @GetMapping("/{customerId}")
    public Card getCardByCustomerId(@PathVariable Long customerId) {
        return cardService.getCardByCustomerId(customerId);
    }
    
    @PutMapping("/{cardId}")
    public void updateCard(@PathVariable Long cardId, @RequestBody Card card) {
        cardService.updateCart(card);
    }
    
    @DeleteMapping("/{cardId}")
    public void emptyCard(@PathVariable Long cardId) {
        cardService.emptyCard(cardId);
    }
}