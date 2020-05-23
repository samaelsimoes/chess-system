package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	/*
	 * Passando apenas o tabuleiro na hora de cria a peça
	 * a posição inicial de uma peça será nula
	*/
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/*
	 *  Retirei o set para o tabuleiro não seja alterado somente classe
	 *  Somente class dentro do mesmo pacote e subclasses podera acessar o tabuleiro de uma peça
	*/
	protected Board getBoard() {
		return board;
	}

	
	
}
