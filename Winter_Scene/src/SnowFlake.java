import java.awt.*;
import javax.swing.*;

public class SnowFlake extends Thing
{
	//these are instance variables
	private int x, y, speed;
		//this is the constructor
	public SnowFlake( int ex, int wy, int sped)
	{
		super(ex,wy,(int)(Math.random() * 1 + 3),(int)(Math.random() * 1 + 3), sped/2, (int)(Math.random()*3 + sped));
		x = ex;
		y = wy;
		speed = sped;
		
	}
	public SnowFlake(SnowFlake f) {
		super(f.getX(), f.getY(),(int)(Math.random() * 1 + 3),(int)(Math.random() * 1 + 3), f.getSpeed()/4, f.getSpeed());
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSpeed() {
		return speed;
	}
	public void paintComponent( Graphics window )
	{
		window.setColor(Color.GRAY);
		window.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		
		window.setColor(Color.WHITE);
		window.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());

			
		//make your own fancy box or any shape you want
		//your shape must be resizeable and scaleable
	}
}