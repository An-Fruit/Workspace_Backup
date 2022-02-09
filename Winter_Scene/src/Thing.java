import java.awt.*;
import javax.swing.*;

public class Thing extends JPanel
{
	private int x, y, w, h, xVel, yVel;  //these are instance variables
	
		//this is the constructor
	public Thing( int ex, int wy, int wd, int ht, int xV, int yV)
	{
		x = ex;
		y = wy;
		w = wd;
		h = ht;
		xVel = xV;
		yVel = yV;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return w;
	}
	public int getHeight() {
		return h;
	}
	public int getXV() {
		return xVel;
	}
	public int getYV() {
		return yVel;
	}
	public void paintComponent( Graphics window )
	{

		//this rectangle shows you the boundaries of what you are drawing
		window.setColor( Color.RED );
		window.drawRect( x, y, w, h );
			
		//make your own fancy box or any shape you want
		//your shape must be resizeable and scaleable
	}
	
	public void xPlus()
	{
	  x = x + xVel;	
	}
	public void xMinus() {
		x = x - xVel;
	}
	public void yPlus() {
		y = y + yVel;
	}
	public void yMinus() {
		y = y - yVel;
	}
	
	
	public void keepInBounds()
	{
		if ( x + w> 1000)x = 0;
		if( y + h> 1000 )y = 0;
		if( x < 0) x = 1000;
		if(y < 0) y = 1000;
	}
}