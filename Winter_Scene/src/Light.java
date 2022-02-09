import java.awt.*;
import java.awt.event.*;

public class Light extends Thing{
	private int xCoord, yCoord;
	private Color clr;
	private int r;
	
	public Light(Color c, int ex, int wy, int wd){
		super(ex, wy, wd, wd, 0, 0);
		xCoord = ex;
		yCoord = wy;
		r = wd;
		clr = c;		
	}
	
	public void paintComponent(Graphics g){
		g.setColor(clr);
		g.fillOval (xCoord, yCoord, r, r);
	}
}