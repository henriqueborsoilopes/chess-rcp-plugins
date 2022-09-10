package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public class Queen extends Piece
{
	
	public Queen(Square square, Side side) 
	{
		super(square, side, 9);
	}
	
	@Override
	public String toString()
	{
		return side == Side.WHITE ? "Q" : "q";
	}
}
