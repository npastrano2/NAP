package ballbounce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonListener implements ActionListener 
{
	private JPanel panel; 
	
	
	public ButtonListener( JPanel panel )
	{
		this.panel = panel; 
	}


	public void actionPerformed(ActionEvent event ) 
	{
		( ( BallControl ) this.panel).getBall().suspend();
	}
}
