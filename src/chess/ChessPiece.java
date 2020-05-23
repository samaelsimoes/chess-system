package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	/*
	 * Retirei o setColor pois não posso alterar a cor, somente buscar as cores preto e branco 
	*/
	public Color getColor() {
		return color;
	}	
}
