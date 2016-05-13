package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class PlayBoard 
{
	//create a game board using an array to represent 
	//|' '| O | X |
	//| O |' '|' '|
	//| X |' '| X |
	//Using an array of 9 elements
	
	private char[] playBoard; 
	
	private char playerMark = 'X'; 
	
	private char computerPCMark; 
	
	private boolean playerTurn; 
	
	private boolean computerTurn; 
	
	private boolean boardFull; 
	
	private int playerMoves; 
	
	private int playerScore; 
	
	private int computerScore; 
	
	
	Player newPlayer = new Player(); 
	
	
	Scanner scan = new Scanner( System.in );
	
	
	public PlayBoard()
	{
		playBoard      = new char[ 9 ];
		playerMark     = 'X'; 
		computerPCMark = 'O';
		playerTurn     = true; 
		computerTurn   = false; 
		boardFull      = false; 
		
		System.out.println( "Welcome! Enter your name: " ); 
		newPlayer.setPlayerName();
		
		initializeBoard(); 
	}
	
	public void initializeBoard()
	{
		
		
		for ( int i = 0; i < 9; i++ )
		{
			playBoard[i] = '-'; 
		}
		//TODO: initialize game board using the array of char and set them to be blank ' '. 
	}
	
	public void printBoard()
	{
		//TODO: print the current board, should probably keep the board up to date whenever a game is going
		//reprint in console to update after each move. 
		System.out.println("-------------" );
		System.out.print( "| " ); 
		for ( int i = 0; i < 3; i++ )
		{
			System.out.print( playBoard[i] + " | " ); 
		}
		
		System.out.println();
		
		System.out.print( "| " );
		for( int i = 3; i < 6; i++ )
		{
			System.out.print( playBoard[i] + " | " ); 
		}
		
		System.out.println(); 
		
		System.out.print( "| " ); 
		for( int i = 6; i < 9; i++ ) 
		{
			System.out.print( playBoard[i] + " | " ); 
		}
		System.out.println(); 
		System.out.println("-------------" );
		
		System.out.println( newPlayer.getPlayerName() + " Vs. " + newPlayer.getComputerName() ); 
		System.out.println( "Score: " + playerScore + " - " + computerScore );
	}
	//loop back around, player moves
	//computer gets to move next inside loop, loops back around player goes until someone meets win or draw conditions met
	public void updateBoard( int i )
	{		
		if( boardFull == true )
		{
			endGame(); 
		}
		else if ( i <= 8 && i >= 0 && playerTurn == true && playBoard[i] == '-' && boardFull == false )
		{
				playBoard[i] = playerMark;
				printBoard(); 
				winGame();
				drawGame();
				playerTurn = false; 
				computerTurn = true; 
				computerMove(); 	
				
		} 
		else if ( playBoard[i] != '-' && playerTurn == true )
		{
			yourMove(); 
		}
		
		else if( i <= 9 && i >= 0 && computerTurn == true && playBoard[i] == '-' && boardFull == false )
		{
				playBoard[i] = computerPCMark; 
				printBoard(); 
				winGame(); 
				drawGame(); 
				computerTurn = false; 
				playerTurn = true; 
				yourMove(); 
				
		}
		else if ( playBoard[i] != '-' && computerTurn == true )
		{
			computerMove(); 
		}
	}
	
	public void computerMove()
	{
		Random rand = new Random(); 
		
		int move = rand.nextInt( 9 );
		
		updateBoard( move ); 
		//randomly generate a number between 0-9 and if spot isn't taken make move.
	}
	public void yourMove()
	{
		System.out.println( " Enter a number between 0-8 to place your mark");
		
		playerMoves = scan.nextInt(); 
		
		switch( playerMoves ) 
		{
		case 0: 
				updateBoard( 0 ); 
			break; 
		case 1: 
				updateBoard( 1 );
			break;
		case 2: 
				updateBoard( 2 );
			break; 
		case 3:
				updateBoard( 3 );
			break; 
		case 4: 
				updateBoard( 4 );
			break; 
		case 5: 
				updateBoard( 5 );
			break; 
		case 6: 
				updateBoard( 6 );
			break; 
		case 7: 
				updateBoard( 7 );
			break; 
		case 8: 
				updateBoard( 8 );
			break; 
		case 9: 
				updateBoard( 9 );
			break; 
		default:
				endGame();
			break; 
		}
		
		
	}
	public void drawGame()
	{
		
		//If board is full and no winner has been decided then game is a draw
		//check board to see if any ' ' spaces remain if not then draw
		
		for ( int mark = 0; mark < 9; mark++ )
		{
			if ( playBoard[mark] == '-' )
			{
				boardFull = false; 
			}else 
				boardFull = true; 
		}  
	}
	
	public void winGame()
	{
		//TODO: check horizontally, vertically, and diagonally, if player or PC has 3 of their marks in a row
		//Declare that player to the winner and end game
		//LATER: add point to player or PC score depending on who wins
		
		//check play board playermark positions if 3 in a row horizontally, vertically, or diagonally, player wins
		
		
	}
	
	public void endGame()
	{
		//TODO: If player enter 'z' or 'Z' end game and restart
		//if win condition met or lose or draw met then restart game
		
		if ( boardFull == true ) 
		{
			System.out.println( " Game is a draw! " ); 
		}
	}
	
	public void loseGame()
	{
		//TODO: if player loses - the PC gets 3 in a row then display you lose message and restart the game using end method
	}
}
	    