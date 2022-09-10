package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public class King extends Piece
{
	public King(Square square, Side side) 
	{
		super(square, side, 99);
	}
	
	@Override
	public String toString()
	{
		return side == Side.WHITE ? "G" : "g";
	}
}
