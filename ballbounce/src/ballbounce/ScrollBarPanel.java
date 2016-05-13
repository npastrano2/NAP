package ballbounce; 

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;


public class ScrollBarPanel extends JPanel
{
	/**
	 * A scroll bar of the panel
	 */
	private JScrollBar scrollBar; 
	
	/**
	 * A label of the panel 
	 */
	private JTextArea area; 

	/**
	 * Constructs a panel with a scroll bar
	 */
	public ScrollBarPanel()
	{
		this.scrollBar = new JScrollBar( JScrollBar.HORIZONTAL ); 
		
		JPanel panel = new JPanel(); 
		panel.setLayout( new BorderLayout() );
		
		panel.add( scrollBar, BorderLayout.WEST ); 
		
		this.scrollBar.addAdjustmentListener( new ScrollBarListener( null ) );
		
		add ( panel ); 
	}
	
	 public JTextArea getTextArea()
	 {
		 return this.area;
	 }
	
	public JScrollBar getScrollBar()
	{
		return this.scrollBar; 
	}
	
	public static void main( String [] args )
	{
		JFrame frame = new JFrame( "Ball Bar" ); 
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		frame.getContentPane().add( new ScrollBarPanel() ); 
		frame.pack();
		frame.setVisible( true );
		
	}
}

