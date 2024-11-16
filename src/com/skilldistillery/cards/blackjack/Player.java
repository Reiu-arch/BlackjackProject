package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	protected BlackjackHand hand;
	//NO List<Card>
	
	public Player() {
		hand = new BlackjackHand();
	}
		//NO getHand()
		public void addCardToHand(Card card) {
			hand.addCard(card);
			
	}
}
