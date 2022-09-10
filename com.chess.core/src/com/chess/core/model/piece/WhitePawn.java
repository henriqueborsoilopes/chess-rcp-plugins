package com.chess.core.model.piece;

import com.chess.core.model.Side;
import com.chess.core.model.Square;

public class WhitePawn extends Piece
{
	public WhitePawn(Square square, Side side) {
		super(square, side, 1);
	}
	
	@Override
	public String toString()
	{
		return "P";
	}
}
