package chess.pieces;

public class Bishop implements PieceInterface {
	private char positionX = 'X';
	private int positionY = 0;
	private final int MAXMOVESPERTURN = 7;
	private boolean color = true; //true is white and false is black, default is white
	
	//returns the position on the board 
	@Override
	public char getPositionx() {
		return positionX;
	}
	
	@Override
	public int getPositiony() {
		return positionY;
	}

	@Override
	public void move(char positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		
	}

	@Override
	public void remove() {
		positionX = 'X';
		positionY = 0;
		
	}

	@Override
	public String getColor() {
		if (color) {
			return "White";
		} else {
			return "Black";
		}
	}

	@Override
	public String getPossibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
