package com.skilldistillery.cards.app;

import java.util.Scanner;

import com.skilldistillery.cards.blackjack.Dealer;
import com.skilldistillery.cards.blackjack.Player;
import com.skilldistillery.cards.common.Card;

public class BlackjackApp {

	private Dealer dealer;
	private Player player;
	private Scanner sc;

	// in the washington game there was a player and dealer turn, before that the
	// cards were distributed two cards each (deal button), may need a first
	// distribution, then player turn, then dealer
	// dealer must play until they each 17 and show one card first round
	// players both cards will both be displayed and can choose to take card (Hit
	// button) until they get close to 21 or go over it and an option to stand
	// (choose to end turn)
	// must compare both hands if neither is bust (ie is blackjack or if dealer is >
	// than player or visaversa)
	// if im able to get this up soon, washington blackjack starts off with two
	// decks (104 cards) for loop
	private BlackjackApp() {
		dealer = new Dealer();
		player = new Player();
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.loseMoney();
	}

	private void loseMoney() {
		// methods needed : first itteration to start off the game, user turn that shows
		// current hand value and cards as well as one card of dealers hand and value of
		// ONE card, then dealers turn that then shows second card, total value of hand,
		// force play till 17 min, and way to check winner
		action();
		winnerWinnerChickenDinner();
	}

	// need more practice with ternarys, could not incorporate multi ternary system
	private void winnerWinnerChickenDinner() {
		if (player.isBust()) {
			System.out.println("you lost!!!");
		} else if (dealer.isBlackjack()) {
			return;
		} else if (dealer.isBust()) {
			System.out.println("You won!!");
		} else if (dealer.getHandValue() == player.getHandValue() && !dealer.isBlackjack()) {
			System.out.println("Tie!!");
		} else if (!dealer.isBust() && dealer.getHandValue() > player.getHandValue() && !player.isBust()) {
			System.out.println("You lost!");
		} else if (!dealer.isBust() && dealer.getHandValue() < player.getHandValue() && !player.isBust()) {
			System.out.println("Good job, your win!");
		}
		return;
	}
	
	
	private void action() {
		System.out.println("Welcome in, are you ready to lose money? Yes or yes");
		sc.nextLine();
		System.out.println("Good choice, lets begin!");
		start();
		userTurn();
		dealerTurn();
	}

	private void start() {
		dealer.deckShuffle();
		Card cardOne = dealer.dealCard();
		Card cardTwo = dealer.dealCard();
		Card cardThree = dealer.dealCard();
		Card cardFour = dealer.dealCard();
		player.addCardToHand(cardOne);
		player.addCardToHand(cardTwo);
		dealer.addCardToHand(cardThree);
		dealer.addCardToHand(cardFour);
		System.out.println("Your cards are " + cardOne + " and " + cardTwo);
		System.out.println(player.getHandValue());
		divider();
		System.out.println("The dealer has a face down card and a " + cardThree);
		divider();

	}

	private String userOption() {
		String input = null;
		System.out.println("What would you like to do? Hit (H) or Stand (S)?");
		try {
			input = sc.nextLine();

		} catch (Exception e) {
			System.err.println("Please input a proper input");
		}
		return input;
	}

	private void userTurn() {

		String input = userOption();
		while (input.equalsIgnoreCase("H")) {
			if (player.isBlackjack()) {
				System.out.println("The player has won, congrats!");
				break;
			} else if (dealer.isBust()) {
				System.out.println("The player has won, congrats!");
				break;
			} else if (dealer.isBlackjack()) {
				System.out.println("Looks like you lost this round.");
				break;
			} else if (player.isBust()) {
				System.out.println("Looks like you lost!");
				break;
			}
			Card cardDealt = dealer.dealCard();
			player.addCardToHand(cardDealt);
			System.out.println("You have " + player.showCards() + " " + player.getHandValue());

			input = userOption();
		}
		if (input.equalsIgnoreCase("S")) {
			System.out.println("Your cards are: " + player.showCards() + " " + player.getHandValue());
			return;

		} else {
			System.err.println("Please choose a correct input!");
			input = userOption();
			System.out.println("Your cards are: " + player.showCards() + " " + player.getHandValue());
		}

	}

	public void dealerTurn() {

		System.out.println("The dealer has " + dealer.showCards() + " " + dealer.getHandValue());
		int cardSum = dealer.getHandValue();

		while (cardSum < 17) {
			if (player.isBlackjack()) {
				System.out.println("The player has won, congrats!");
				break;
			} else if (dealer.isBust()) {
				System.out.println("The player has won, congrats!");
				break;
			} else if (dealer.isBlackjack()) {
				System.out.println("Looks like you lost this round.");
				break;
			} else if (player.isBust()) {
				System.out.println("Looks like you lost!");
				break;
			}
	
			Card nextCard = dealer.dealCard();
			dealer.addCardToHand(nextCard);
			cardSum = dealer.getHandValue();
			System.out.println("The dealer has " + dealer.showCards() + " " + dealer.getHandValue());
			if (dealer.isBlackjack()) {
				System.out.println("You lost, the dealer hit blackjack.");
				return;
			}
		}
	}
	

	private void divider() {
		System.out.println("==============================================");
	}

}
