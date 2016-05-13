package magic;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestMagicSquare 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		Scanner input = new Scanner(new File("magicData.txt")); 
		
		int count = 1; 
		int size  = input.nextInt(); 
		//int Square [][];
		//Square = new int [size][size]; 
		//int [][] Square = null; 
		while(size != -1)
		{
			MagicSquare s2 = new MagicSquare(size); 
			
			//# square we are on
			System.out.println("Current Square: " + count + "\n");
			
			//inputs file values into Square
			for(int row = 0; row < s2.getSquare().length; row++)
			{
				for(int col = 0; col < s2.getSquare().length; col++)
				{
					s2.getSquare()[row][col] = input.nextInt(); 
				}
			}

			//Prints size of and square matrix
			System.out.println(s2.toString()); 
			
			//Prints the sumRow(row)
			for (int row = 0; row < size; row++)
			{
				System.out.println("Row #: " + row + "\tSum: " + s2.sumRow(row)); 
			}	
			System.out.println();
			
			//prints the sumCol(col)
			for(int col = 0; col < size; col++)
			{
				System.out.println("Column #: " + col + "\tSum: " + s2.sumCol(col)); 
			}
			//adds a line space
			System.out.println();
			
			//prints the sumDiag and otherDiag
			System.out.println("Sum of Diag: " + s2.sumMainDiag()); 
			System.out.println("Sum of ODiag: " + s2.sumOtherDiag()); 
			
			//Magic square or not
			System.out.println("Its a Magic Square!: " + s2.magic() + "\n"); 
			size = input.nextInt(); 
			count ++; 
		}
		input.close();
	}
}

