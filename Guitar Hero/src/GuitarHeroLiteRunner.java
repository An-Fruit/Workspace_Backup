import javax.swing.JFrame;
import java.awt.*;
import java.util.*;
public class GuitarHeroLiteRunner extends JFrame
{
	private  String Keyboard ; 
	private  GuitarString[] notes;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	public GuitarHeroLiteRunner()
	{
		super("GuitarHeroLiteRunner");
		
		setSize(WIDTH,HEIGHT);

		getContentPane().add(  new KeyTrapper() );		
		
		setVisible(true);	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main( String args[] )
	{
		
		GuitarHeroLiteRunner run = new GuitarHeroLiteRunner();
	}
}