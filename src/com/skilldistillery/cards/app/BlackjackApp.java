package com.skilldistillery.cards.app;

import java.util.Scanner;

import com.skilldistillery.cards.blackjack.Dealer;
import com.skilldistillery.cards.blackjack.Player;

public class BlackjackApp {
	
	private Dealer dealer;
	private Player player;
	private Scanner sc;
	
	//in the washington game there was a player and dealer turn, before that the cards were distributed two cards each (deal button), may need a first distribution, then player turn, then dealer
	//dealer must play until they each 17 and show one card first round 
	//players both cards will both be displayed and can choose to take card (Hit button) until they get close to 21 or go over it and an option to stand (choose to end turn)
	//must compare both hands if neither is bust (ie is blackjack or if dealer is > than player or visaversa)
	//if im able to get this up soon, washington blackjack starts off with two decks (104 cards) for loop
	private BlackjackApp() {
		dealer = new Dealer();
		player  = new Player();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.loseMoney();
	}

	private void loseMoney() {
		//methods needed : first itteration to start off the game, user turn that shows current hand value and cards as well as one card of dealers hand and value of ONE card, then dealers turn that then shows second card, total value of hand, force play till 17 min, and way to check winner
	}
	
	//practice in ternarys almost had it, had to use chatgpt, did not know it ALL needed to be encapsulated within a println to work (will only one of the options print and the others not since all in one println? will find out soon)
	//need more practice with ternarys
	public void winnerWinnerChickenDinner() {
	    System.out.println(
	        player.isBust() ? "Looks like you lost." :
	        dealer.isBlackjack() ? "Good job, your win this time!": 
	        dealer.isBust() ? "Looks like the dealer lost, you win!" :
	        dealer.getHandValue() == player.getHandValue() && !dealer.isBlackjack() ? "Tie, pushed to next round." :
	        dealer.getHandValue() > player.getHandValue() ? "Dealer has a higher hand, you lose!" :
	        "Your win!"
	    );
	}

}
