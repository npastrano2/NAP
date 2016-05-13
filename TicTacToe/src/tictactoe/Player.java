package tictactoe;

import java.util.Scanner;

public class Player 
{
	private String playerName; 
	
	private final String COMPUTERNAME = "Socrates"; 
	
	private Scanner name = new Scanner( System.in ); 
	
	
	public void setPlayerName()
	{
		playerName = name.nextLine(); 
	}
	
	public String getPlayerName()
	{
		
		return playerName; 
		
	}
	
	public String getComputerName()
	{
		
		return COMPUTERNAME; 
		
	}
	
	public String toString()
	{
		return " "; 
	}

}
