package chess.pieces;

public interface PieceInterface {
	 
	public String getPossibleMoves();
	
	public char getPositionx();
	
	public int getPositiony();
	
	public void move(char positionx, int positiony);
	
	public void remove();
	
	public String getColor();
}
