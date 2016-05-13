package ballbounce;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarListener implements AdjustmentListener
{
	/**
	 * A reference to a panel 
	 */
	private JPanel panel;

	Ball ball; 
	public ScrollBarListener( JPanel panel )
	{
		this.panel = panel; 
	}
	
	public void adjustmentValueChanged( AdjustmentEvent e ) 
	{
		if( this.panel instanceof BallControl )
		{
			( ( BallControl ) this.panel).getBall().setDelay( ( ( BallControl ) this.panel).getDelayBar().getMaximum() - e.getValue() );
		}
	} 

	
}
