package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
	}
		//If less than 17 then hit (this may be need to be on the blackjack app
		//NO getDeck()
		//needs everything the player has
		//dealer deals cards (an array or cards?) and shuffles deck
		//dealer should shuffle the deck too
	
		public void deckShuffle() {
			deck.shuffleCards();
		}
		
		public Card[] dealCardsFromDeck(int cards){
			Card[] cardsDelt = new Card[cards];
			for (int i = 0; i < cardsDelt.length; i++) {
				cardsDelt[i] = deck.dealCard();
			}
			return cardsDelt;
			
		}
		//needs a way to access the deck for a card
		public Card dealCard() {
			return deck.dealCard();
		}
	}
