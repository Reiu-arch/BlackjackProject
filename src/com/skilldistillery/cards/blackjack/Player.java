package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	protected BlackjackHand hand;
	//NO List<Card>
	//since dealer extends player more general actions must be listed here
	//player has a blackjack hand (is not a hand, this is why we have it as a field)
	//both player and dealer need a value, dealers needs to only show value of one card first showing
	//(maybe call value of each card seperately instead of total like in washington post game
	//need an is 21 or over
	
	
	public Player() {
		hand = new BlackjackHand();
	}
		//NO getHand()
		public void addCardToHand(Card card) {
			hand.addCard(card);
			
	}
}
