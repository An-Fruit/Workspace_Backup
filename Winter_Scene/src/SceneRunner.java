import java.awt.*;
import javax.swing.*;

public class SceneRunner extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;

	public SceneRunner()
	{
		super("Animation Runner");

		setSize(WIDTH,HEIGHT);
			
        AnimatedScene scene = new AnimatedScene();
       
		add(scene);
		
		setVisible(true);	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		SceneRunner run = new SceneRunner();
	}
}