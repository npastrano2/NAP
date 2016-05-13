package tictactoe;

public class Play 
{
	public static void main( String[] args )
	{
		PlayBoard startGame = new PlayBoard();
		
		
		
		startGame.initializeBoard(); 
		startGame.printBoard();
		startGame.yourMove(); 
		startGame.printBoard(); 
	}
}
