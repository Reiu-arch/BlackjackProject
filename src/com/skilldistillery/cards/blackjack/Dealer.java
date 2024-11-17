package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
	}
		//If less than 17 then hit
		//NO getDeck()
		//needs everything the player has
		//dealer deals cards (an array or cards?) and shuffles deck
		
		public Card dealCard() {
			return deck.dealCard();
		}
	}
