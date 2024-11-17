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
		
	}

}
