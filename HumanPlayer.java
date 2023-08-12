package com.muthu.game;

import java.util.Scanner;

public class HumanPlayer extends Player{
	public HumanPlayer(String name,char mark) {
		this.name=name;
		this.mark=mark;
	}

	void makeMove() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter row and column");
			row = s.nextInt();
			col = s.nextInt();
		}while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);			
	}
}
