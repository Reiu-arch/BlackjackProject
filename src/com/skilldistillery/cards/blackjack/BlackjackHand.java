package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends AbstractHand {

	public int getHandValue;

	public void addCard(Card card) {
		
	}

	@Override
	public int getHandValue() {
		return 0;
	}
	
	//need an isBust method gethandval => 21
	//need an isBlackjack gethandval == 21
	//need to flesh out gethandvalue.....maybe a for each card add the card value and return it to this.public int

}
