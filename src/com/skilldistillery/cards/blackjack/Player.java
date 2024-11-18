package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	protected BlackjackHand hand;
	// NO List<Card>
	// since dealer extends player more general actions must be listed here
	// player has a blackjack hand (is not a hand, this is why we have it as a
	// field)
	// both player and dealer need a value, dealers needs to only show value of one
	// card first showing
	// (maybe call value of each card seperately instead of total like in washington
	// post game
	// need an is 21 or over

	//get a new blackjack hand 
	public Player() {
		hand = new BlackjackHand();
	}

	// NO getHand()
	
	//gets a new card from dealer (or maybe directly from deck, or deck to dealer to player, not sure)
	public void addCardToHand(Card card) {
		hand.addCard(card);

	}

	public boolean isBust() {
		return hand.isBust();
	}
	//probably wont be able to add a natural blackjack and regular blackjack
	public boolean isBlackjack() {
		return hand.isBlackjack();

	}

	public int getHandValue() {
		return hand.getHandValue();
	}
	public String showCards() {
		return hand.showCards();
	}

	//need a way to show the cards in hand, not just the total value (Then youre not able to make an educated guess ie count cards...but where to put it to pull it from)
}
