package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public class Rook extends Piece
{
	public Rook(Square square, Side side) 
	{
		super(square, side, 5);
	}
	
	@Override
	public String toString()
	{
		return side == Side.WHITE ? "R" : "r";
	}
}
