package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
private List<Card> cards = new ArrayList<Card>(52);


public Deck() {
	for(Suit s : Suit.values()) {
		for (Rank r :Rank.values()) {
			cards.add(new Card(r, s));
		}
	}
}

public int checkDeckSize() {
	return cards.size();
}

public Card dealCard() {
	return cards.remove(0);
}

public void shuffleCards() {
	Collections.shuffle(cards);
}
}
