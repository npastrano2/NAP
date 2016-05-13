package ballbounce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ResumeListener implements ActionListener 
{
	private JPanel panel; 
	
	
	public ResumeListener( JPanel panel )
	{
		this.panel = panel; 
	}


	public void actionPerformed(ActionEvent event ) 
	{
		( ( BallControl ) this.panel).getBall().resume();
	}
}
