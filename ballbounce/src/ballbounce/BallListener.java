package ballbounce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BallListener implements ActionListener
{
	private Ball ball; 
	
	public BallListener( Ball ball )
	{
		this.ball = ball; 
	}
	public void actionPerformed( ActionEvent event )
	{
		ball.setXPos( ball.getXPos() + ball.getDXPos() ); 
		ball.setYPos( ball.getYPos() + ball.getDYPos() ); 
		
		if( ball.getXPos() <= 0 || ball.getXPos() >= ball.getWidth() - ball.radius() )
		{
			ball.setDXPos( ball.getDXPos() * -1 ); 
		}
		
		if( ball.getYPos() <= 0 || ball.getYPos() >= ball.getHeight() - ball.radius() )
		{
			ball.setDYPos( ball.getDYPos() * -1 );
		}
			
		ball.repaint(); 
		
	}
}
