package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public class Bishop extends Piece
{
	public Bishop(Square square, Side side) 
	{
		super(square, side, 3);
	}
	
	@Override
	public String toString()
	{
		return side == Side.WHITE ? "B" : "b";
	}
}
