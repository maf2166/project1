package chess.parts;

import ch03.stacks.LinkedStack;

public class Board {
	public static Piece[][] boardArray = new Piece[8][8];
	public LinkedStack<Piece> whiteTaken = new LinkedStack<Piece>();
	public LinkedStack<Piece> blackTaken = new LinkedStack<Piece>();
	public Board() {
		newGame(); 
		
	}
	
	public static void newGame() {
		//white pawns
		for (int i = 0; i < 8; i++) {
			boardArray[1][i] = new Piece('p', 'W');
			boardArray[1][i].setRow(1);
			boardArray[1][i].setColumn(i);
			
		}
		//black pawns
		for (int i = 0; i < 8; i++) {
			boardArray[6][i] = new Piece('p', 'B');
			boardArray[6][i].setRow(6);
			boardArray[6][i].setColumn(i);
		}
		
		//setting white pieces
		for (int i = 0; i < 2; i++) {
			int row;
			char color;
			if (i == 0) {
				color = 'W';
				row = 0;
			} else {
				color = 'B';
				row = 7;
			}
			boardArray[row][0] = new Piece('r', color);
			boardArray[row][1] = new Piece('k', color);
			boardArray[row][2] = new Piece('b', color);
			boardArray[row][3] = new Piece('Q', color);
			boardArray[row][4] = new Piece('K', color);
			boardArray[row][5] = new Piece('b', color);
			boardArray[row][6] = new Piece('k', color);
			boardArray[row][7] = new Piece('r', color);
			
			boardArray[row][0].setRow(row);
			boardArray[row][1].setRow(row);
			boardArray[row][2].setRow(row);
			boardArray[row][3].setRow(row);
			boardArray[row][4].setRow(row);
			boardArray[row][5].setRow(row);
			boardArray[row][6].setRow(row);
			boardArray[row][7].setRow(row);
			
			boardArray[row][0].setColumn(0);
			boardArray[row][1].setColumn(1);
			boardArray[row][2].setColumn(2);
			boardArray[row][3].setColumn(3);
			boardArray[row][4].setColumn(4);
			boardArray[row][5].setColumn(5);
			boardArray[row][6].setColumn(6);
			boardArray[row][7].setColumn(7);
			
		}
		
		
	}
	
	public void printBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == 7) {
					System.out.println(boardArray[i][j]);
				} else {
					System.out.print(boardArray[i][j] + ", ");
				}
			}
		}
	}
	
	public void playerMove(int oldRow, int oldColumn, int newRow, int newColumn) {
		if (!(boardArray[newRow][newColumn] == null)) {
			takePiece(oldRow, oldColumn, newRow, newColumen);
		} else if () // if it is the same color then it cant be allowed from availible moves
		
		/*
		 * In this method I need checks to see if the space has a piece already, what color it is
		 * and if this move puts the other player in check or checkmate
		 */
	}
	
	public void movePiece(int oldRow, int oldColumn, int newRow, int newColumn) {
		
		boardArray[newRow][newColumn] = boardArray[oldRow][oldColumn];
		boardArray[oldRow][oldColumn] = null;
		boardArray[newRow][newColumn].setRow(newRow);
		boardArray[newRow][newColumn].setColumn(newColumn);
	}
	
	public void takePiece(int oldRow, int oldColumn, int newRow, int newColumn) {
		if (boardArray[newRow][newColumn].color == 'W') {
			blackTaken.push(boardArray[newRow][newColumn]);
		} else {
			whiteTaken.push(boardArray[newRow][newColumn]);
		}
		movePiece(oldRow, oldColumn, newRow, newColumn);
	}
}