package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {

		//
		protected List<Card> cardsInHand;
		
		public AbstractHand()	{
			cardsInHand = new ArrayList<Card>();
		}
		
		public abstract int getHandValue();
		
		public void addCard(Card card) {
			cardsInHand.add(card);
		}
		
		public String showCards() {
			return "" + cardsInHand;
		}
		
		//NO getHand()
		//what do both players do? not the aspects of the game its self but how do they act?
		//they have a value, you can add a card to your hand
		//since clear is for concurrent games i dont find it necessary for single game
		
		
}
