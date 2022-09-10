package com.chess.core.model;

import com.chess.core.model.piece.Piece;

public class Square 
{
	private final Board board;
	private final Integer row;
	private final Integer col;
	private Piece piece;
	
	public Square(Board board, Integer row, Integer col)
	{
		this.board = board;
		this.row = row;
		this.col = col;
	}
	
	public void setPiece(Piece piece)
	{
		this.piece = piece;
	}
}
