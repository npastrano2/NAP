package magic;

import java.util.Arrays;

/**
 * Creates a square matrix and tests it to see if it is a magic square
 * @author Nicholas Pastrano
 * @version 1.0
 */
public class MagicSquare 
{
	/**
	 * Represents a 2D array of Square
	 */
	private int[][] Square; 
	
	/**
	 * Represents the size of this square matrix
	 */
	private int size; 
	
	/**
	 * Constructs a new 2D array square of given size, 
	 * initializes the square with 0s. The size of the square matrix 
	 * of this square. It s the number of rows and the number of columns
	 * each row is divided into in this square matrix. 
	 * @param Size 
	 * @param Square A 2D array containing a square matrix
	 */
	public MagicSquare(int size)
	{
		this.size = size; 
		this.Square = new int [size][size];
	}
	
	/**
	 * Changes the square matrix of this square to be a new square matrix.
	 * Square matrix is a 2D array filled with numbers.
	 * @param Square A 2D array square matrix containing numbers 
	 */
	public void setSquare(int[][] Square)
	{
		for(int row = 0; row < Square.length; row++)
		{
			for(int col = 0; col < Square.length; col++)
			{
				this.Square = Square; 
			}
		}
		//this.Square = new int[size][size];
	}
	
	/**
	 * Returns the square matrix of this square.
	 * @return A square matrix of this square
	 */
	public int[][] getSquare()
	{
		return this.Square; 
	}

	/**
	 * Returns the sum of the values in the given row. 
	 * @return A sum of the values in the given row
	 */
	public int sumRow(int row) 
	{
		int sum = 0; 
		for(int col = 0; col < Square.length; col++)
		{
			sum += Square[row][col]; 
		}
		return sum; 
	}
	
	/**
	 * Returns the sum of the values in the given column.
	 * @return A sum of the values in the given column
	 */
	public int sumCol(int col)
	{
		int sum = 0; 
		
		for(int row = 0; row < Square.length; row++)
		{
			sum += Square[row][col]; 
		}
		return sum; 
	}
	
	/**
	 * Returns the sum of the values in the main diagonal.
	 * @return A sum of the values in the main diagonal
	 */
	public int sumMainDiag()
	{
		 int sum = 0; 
		 
		 for (int d = 0; d < Square.length; d++)
		 {
			 // sum = sum + Square[d][d];
			 sum += Square[d][d];
		 }
		 return sum; 
	}
	
	/**
	 * Returns the sum of the values in the other reverse diagonal.
	 * @return A sum value of the other reverse diagonal
	 */
	public int sumOtherDiag()
	{
		int sum = 0; 
		for (int d = 0; d < Square.length; d++)
		{
			sum+= Square[d][Square.length - 1 - d]; 
		}
		return sum;
	}
	
	/**
	 * Returns true if the squares rows, columns and diagonals have the same sum, 
	 * false otherwise.
	 * @return A boolean value specifying whether the squares rows, columns and diagonals have the same sum
	 */
	public boolean magic()
	{
		//find out if the sum of all rows, columns and diagonals are the same
		if(this.sumMainDiag() != this.sumOtherDiag())
		{
			return false; 
		}
		else
		{
			for(int row = 0; row < this.size; row++)
			{
				if(this.sumMainDiag() != this.sumRow(row))
				{
					return false; 
				}
			}
			
			for(int row = 0; row < this.size; row++)
			{
				if(this.sumRow(row) != this.sumCol(row))
				{
					return false; 
				}
			}
		}
	
		return true; 
	}
	
	/**
	 * Returns a string representing the contents of the square, formatted.
	 * @return A formatted string representation of the contents of the square
	 */
	public String toString()
	{
		String square = "~~~~~~~~~~~~~~~~~~~~~~~"; 
		System.out.println(size);
		for(int row = 0; row < getSquare().length; row++)
		{
			for(int col = 0; col < getSquare().length; col++)
			{ 
				System.out.print(getSquare()[row][col] + "  "); 
			}
			System.out.println(); 
		}
		return square; 
	}
	
	
	/**
	 * Compares this square with the other square.
	 * @return A boolean value specifying whether this square is the
	 * same as the other
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof MagicSquare))
		{
			return false; 
		}
		MagicSquare other = (MagicSquare) obj; 
		
		//int[][] Arrays = Square;equals(this.Square = other.Square);
		return Arrays.equals(this.Square, other.Square);
						 

	}
}