package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	/*
	 * Passando apenas o tabuleiro na hora de cria a pe�a
	 * a posi��o inicial de uma pe�a ser� nula
	*/
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/*
	 *  Retirei o set para o tabuleiro n�o seja alterado somente classe
	 *  Somente class dentro do mesmo pacote e subclasses podera acessar o tabuleiro de uma pe�a
	*/
	protected Board getBoard() {
		return board;
	}

	
	
}
