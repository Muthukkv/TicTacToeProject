package com.muthu.game;

public class LaunchGame {
	public static void main(String[] args) {
		new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Muthu", 'X');
		AIPlayer p2 = new AIPlayer("Arun", 'O');
		Player cp;
		cp =p1;
		TicTacToe.display();

		while(true) {
			System.out.println(cp.name+" turn");
			cp.makeMove();
			TicTacToe.display();
			if(TicTacToe.colWinCheck() || TicTacToe.rowWinCheck() || TicTacToe.diagWinCheck()) { 
				System.out.println(cp.name+" has won");
				break;
			}
			else if(TicTacToe.drawCheck()) {
				System.out.println("Match Draw");
				break;
			}
			else {
				if(cp==p1) {
					cp=p2;
				}
				else {
					cp = p1;
				}
			}


		}
	}
}
