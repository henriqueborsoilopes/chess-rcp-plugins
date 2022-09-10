package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public abstract class Piece 
{
	private final Integer score;
	private Square square;
	private final Side side;
	
	public Piece(Integer score, Side side)
	{
		this.score = score;
		this.side = side;
	}
}
