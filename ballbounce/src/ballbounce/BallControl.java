package ballbounce;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;

public class BallControl extends JPanel
{
	/**
	 * The ball 
	 */
	private Ball ball; 
	
	/**
	 * The suspend button
	 */
	private JButton suspend; 
	
	/**
	 * The resume button
	 */
	private JButton resume; 
	
	/**
	 * The delay scroll bar 
	 */
	private JScrollBar delay;
	
	public BallControl()
	{
		this.suspend = new JButton( "Suspend" ); 
		this.resume = new JButton( "Resume" );
		this.ball = new Ball(); 
		this.delay = new JScrollBar( JScrollBar.HORIZONTAL ); 
		
		JPanel panel = new JPanel();  
		panel.add( this.suspend ); 
		panel.add( this.resume ); 
		
		this.ball.setDelay( this.delay.getMaximum() ); 
		setLayout( new BorderLayout() ); 
		
		add( this.delay, "North" ); 
		add( this.ball, "Center" ); 
		add( panel, "South" ); 
		
		this.delay.addAdjustmentListener( new ScrollBarListener( this ) );
		this.suspend.addActionListener( new ButtonListener( this ) ); 
		this.resume.addActionListener( new ResumeListener( this ) ); 
	}
	
	/**
	 * Returns the delay scroll bar.
	 */
	 public JScrollBar getDelayBar()
	 {
		 return this.delay;
	 }
	
	/**
	 * Return an Ball of this ball.
	 */
	public Ball getBall()
	{
		return this.ball; 
	}
	
	/**
	 * Returns the button suspend.
	 */
	public JButton getSuspendButton()
	{
		return this.suspend; 
	}
	
	/**
	 * Returns the button resume.
	 */
	public JButton getResumeButton()
	{
		return this.resume;
	}
	
}
