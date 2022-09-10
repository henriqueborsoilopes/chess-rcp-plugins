package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public abstract class Piece 
{
	private final Integer score;
	private Square square;
	protected final Side side;
	
	protected Piece(Square square, Side side, Integer score)
	{
		this.square = square;
		this.square.setPiece(this);
		this.score = score;
		this.side = side;
	}
}
