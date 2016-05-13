package ballbounce;

import javax.swing.JFrame;

public class BallBouncing 
{
	public BallBouncing()
	{
		JFrame frame = new JFrame( "Ball Bar" ); 
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane().add( new BallControl() ); 
		frame.pack(); 
		frame.setVisible( true );
	}
	
	public static void main( String [] args )
	{
		new BallBouncing(); 
	}
}
