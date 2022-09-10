package com.chess.app.room;

import com.chess.core.model.Army;
import com.chess.core.model.Board;
import com.chess.core.model.Side;
import com.chess.core.model.piece.Bishop;
import com.chess.core.model.piece.BlackPawn;
import com.chess.core.model.piece.King;
import com.chess.core.model.piece.Knight;
import com.chess.core.model.piece.Queen;
import com.chess.core.model.piece.Rook;
import com.chess.core.model.piece.WhitePawn;

public class ChessRoom 
{
	private final Board board;
	
	public ChessRoom()
	{
		Army whiteArmy = new Army();
		Army blackArmy = new Army();
		board = new Board(whiteArmy, blackArmy);
		
		for (int col = 0; col < Board.LENGTH; col++) 
		{
			whiteArmy.addPiece(new WhitePawn(board.getSquare(1, col), Side.WHITE));
		}
		whiteArmy.addPiece(new Rook(board.getSquare(0, 0), Side.WHITE));
		whiteArmy.addPiece(new Rook(board.getSquare(0, 7), Side.WHITE));
		whiteArmy.addPiece(new Knight(board.getSquare(0, 1), Side.WHITE));
		whiteArmy.addPiece(new Knight(board.getSquare(0, 6), Side.WHITE));
		whiteArmy.addPiece(new Bishop(board.getSquare(0, 2), Side.WHITE));
		whiteArmy.addPiece(new Bishop(board.getSquare(0, 5), Side.WHITE));
		whiteArmy.addPiece(new Queen(board.getSquare(0, 3), Side.WHITE));
		whiteArmy.addPiece(new King(board.getSquare(0, 4), Side.WHITE));
		
		for (int col = 0; col < Board.LENGTH; col++) 
		{
			blackArmy.addPiece(new BlackPawn(board.getSquare(6, col), Side.BLACK));
		}
		blackArmy.addPiece(new Rook(board.getSquare(7, 0), Side.BLACK));
		blackArmy.addPiece(new Rook(board.getSquare(7, 7), Side.BLACK));
		blackArmy.addPiece(new Knight(board.getSquare(7, 1), Side.BLACK));
		blackArmy.addPiece(new Knight(board.getSquare(7, 6), Side.BLACK));
		blackArmy.addPiece(new Bishop(board.getSquare(7, 2), Side.BLACK));
		blackArmy.addPiece(new Bishop(board.getSquare(7, 5), Side.BLACK));
		blackArmy.addPiece(new Queen(board.getSquare(7, 4), Side.BLACK));
		blackArmy.addPiece(new King(board.getSquare(7, 3), Side.BLACK));
	}
}
