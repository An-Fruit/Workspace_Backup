import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.MouseInfo;
import java.awt.Polygon;

public class AnimatedScene extends JPanel implements Runnable
{
	//instance variables
	//Stacks and Maps	
	
	Queue<SnowFlake> snow = new LinkedList<>();
	ArrayList<SnowFlake> snows = new ArrayList<>();
	Queue<tree> forest = new LinkedList<>();
	Set<Integer> starLocX = new HashSet<>();
	Set<Integer> starLocY = new HashSet<>();
	List<Star> stars = new ArrayList<>();
	public AnimatedScene ()
	{
		
		setBackground(Color.WHITE);
		
		for(int i = 0; i < 1000; i++) {
			snows.add(new SnowFlake((int)(Math.random() * 1000) + 5, (int)(Math.random() * 1000), (int)(Math.random() * 3) + 4));	
		}
		//sets X and Y locations for the stars
		for(int i = 0; i < 20; i++) {
			int[] loc = new int[2];
			for(int t = 0; t < 2; t++) {
				int pick = (int)(Math.random() * 1000);
				loc[t] = pick;
				if(t == 0) starLocX.add(pick);
				else starLocY.add(pick);
			}
			Star a = new Star(loc[0],loc[1], (Math.random() * 1) + 7);
			stars.add(a);
			
		}
		new Thread(this).start();
		
	}

	public void paintComponent( Graphics window )
	{
		//must be hard coded otherwise trees will be randomly redrawn every .05 seconds
		forest.offer(new tree(130, 200, 110, 530));
		forest.offer(new tree(140, 230, 200, 520));
		forest.offer(new tree(120, 270, 375, 500));
		
		//sky
		
		window.setColor(new Color(17, 20, 61));
		window.fillRect( 0,0, 1000, 1000);
		for(int i = 0; i < stars.size(); i++) {
			Color c = Color.YELLOW;
			stars.get(i).paintComponent(window, c);
		}
		
		//snow/landscape
		window.setColor(Color.WHITE);
		window.drawString("Mouse  coordinates " + "(" + MouseInfo.getPointerInfo().getLocation().x + "   " + MouseInfo.getPointerInfo().getLocation().y + ")", 250, 30 );
		window.fillRect(0,700,1000,300);
		//stars
		
		//trees
		
		while(!forest.isEmpty()) {
			tree f = forest.poll();
			f.paintComponent(window);
		}
		
		//moon
		
		window.setColor(Color.LIGHT_GRAY);
		window.fillOval(75, 50, 100, 100);
		
	//building
		//chimney
		window.setColor(new Color(192, 192, 192));
		window.fillRect(700, 500, 40, 60);
		//house "body"
		window.setColor(new Color(51, 25, 0));
		window.fillRect(500, 600, 300, 150);
		window.setColor(Color.BLACK);
		for(int i = 600; i < 750; i += 30) {
			window.fillRect(500, i, 300, 5);
		}
		int[] roofX = new int[] {480, 650, 820};
		int[] roofY = new int[] {600, 500, 600};
		Polygon roof = new Polygon(roofX, roofY, roofX.length);
		window.fillPolygon(roof);
		
		//house door
		window.setColor(Color.RED);
		window.fillRect(650, 675, 50, 75);
		window.setColor(Color.YELLOW);
		window.fillOval(685, 715, 10,10);
		//window
		window.fillRect(550, 650, 50, 50);
		window.setColor(new Color(51, 25, 0));
		window.fillRect(550, 675, 50, 5);
		window.fillRect(573, 650, 5, 50);
		//snow
		
		for(int i = 0; i < snows.size(); i++) {
			snows.get(i).paintComponent(window);
			snows.get(i).yPlus();
			snows.get(i).xPlus();
			snows.get(i).keepInBounds();
		}
		
	
		
	}
	
	public void run()
	{

		try
		{
			while( true )
			{	
			   Thread.sleep(50);
			   repaint();
			}
		}
		catch( Exception e )
		{
			
		}

	}
}