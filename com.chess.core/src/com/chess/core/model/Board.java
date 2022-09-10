package com.chess.core.model;

public class Board 
{
	public static final Integer LENGTH = 8;
	
	private Square[][] squares;
	
	public Board()
	{
		squares = new Square[LENGTH][LENGTH];
		
		for (int row = 0; row < LENGTH; row++) 
		{
			for (int col = 0; col < LENGTH; col++) 
			{
				squares[row][col] = new Square(this, row, col);
			}
		}
	}
	
	public Square getSquare(Integer row, Integer col)
	{
		return squares[row][col];
	}
}
