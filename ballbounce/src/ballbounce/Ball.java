package ballbounce;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel; 

import javax.swing.Timer;

public class Ball extends JPanel
{
	/**
	 * The current x position of the ball. 
	 */
	private int x; 
	
	/**
	 * The current position of the ball. 
	 */
	private int y;
	
	/**
	 * The delay to move in milliseconds.
	 */
	private int dx; 
	
	/**
	 * The delay to move in milliseconds y.
	 */
	private int dy; 

	/**
	 * The radius of the ball. 
	 */
	private int radius; 
	
	/**
	 * The delay in milliseconds.
	 */
	private int delay; 
	/**
	 * The integer timer for the ball to move.
	 */
	private Timer timer; 
	
	/**
	 * Constructs a ball with radius, position, delay and timer.
	 */
	public Ball() 
	{		
		this.delay = 20; 
		this.radius = 20; 
		this.x = 0; 
		this.y = 40; 
		this.dx = 3; 
		this.dy = 3; 
		
		setPreferredSize( new Dimension( 500, 400 ) ); 
		setBackground( Color.black ); 

		timer = new Timer( this.delay, new BallListener( this ) ); 

		this.timer.start(); 
	}
	
	/**
	 * Returns an integer value representing the x pos of the ball.
	 */
	public int getXPos()
	{
		return this.x; 
	}
	
	/**
	 * Changes the x pos of the ball.
	 * @param x A integer representing x pos
	 */
	public void setXPos( int x ) 
	{
		this.x = x; 
	}

	/**
	 * Returns an integer value representing the y pos of the ball.
	 */
	public int getYPos()
	{
		return this.y; 
	}
	
	/**
	 * Changes the y pos of the ball.
	 * @param y A integer representing the y pos of the ball
	 */
	public void setYPos( int y )
	{
		this.y = y; 
	}
	
	/**
	 * Returns the integer value representing the x pos movement of ball.
	 */
	public int getDXPos()
	{
		return this.dx; 
	}
	
	/**
	 * Changes the DX pos movement of the ball.
	 * @param dx A integer representing the movement of the ball
	 */
	public void setDXPos( int dx )
	{
		this.dx = dx; 
	}
	
	/**
	 * Returns an integer value representing the y pos movement of ball.
	 */
	public int getDYPos()
	{
		return this.dy; 
	}
	
	/**
	 * Changes the DY pos movement of the ball.
	 * @param dy A integer representing the movement of the ball
	 */
	public void setDYPos( int dy )
	{
		this.dy = dy;
	}
	
	/**
	 * Changes the state of timer to stop.
	 */
	public void suspend()
	{
		this.timer.stop(); 
	}
	
	/**
	 * Changes the state of timer to resume.
	 */
	public void resume() 
	{
		this.timer.start(); 
	}
	
	/**
	 * Returns a integer value representing the radius of the ball.
	 */
	public int radius()
	{
		return this.radius; 
	}
	
	/**
	 * Returns a integer value representing the delay in milliseconds between ball pos changes
	 */
	public int getDelay()
	{
		return this.delay; 
	}
	
	/**
	 * Changes the delay in milliseconds
	 */
	public void setDelay( int delay )
	{
		this.delay = delay; 
		this.timer.setDelay( delay ); 
	}
	
	public void paintComponent( Graphics page )
	{
		super.paintComponent( page ); 
		
		page.setColor( Color.RED ); 
		page.fillOval( this.x, this.y, this.radius, this.radius ); 
		
	}
	
}
