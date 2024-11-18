package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends AbstractHand {

	public int getHandValue;
	
	
	//for each card in hand the value is added back into the sum of said hand
	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card : cardsInHand) {
			handValue += card.getValue(handValue);
		}
		return handValue;
	}
	
	//if number in hand is equal to 21 then it is blackjack, if not then not blackjack
	public boolean isBust() {
		if (getHandValue == 21) {
			return true;
		}
		return false;
	}
	
	//if number in hand is over 21 then handValue is bust, if under or equal to 21 then not bust.
	public boolean isBlackjack() {
		if(getHandValue > 21) {
			return true;
		}
		return false;
	}
	//need an isBust method gethandval => 21 either is or is not (boolean)
	//need an isBlackjack gethandval == 21  "                            "
	//need to flesh out gethandvalue.....maybe a for each card add the card value and return handvalue to gethandvalue

}
