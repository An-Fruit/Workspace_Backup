import java.awt.*;

public class Star extends Thing{
	
	private int Ycoord, Xcoord;
	private double radius;
	private int[] yCoords, xCoords;
	
	public Star(int Y, int X, double r) {
		super(X, Y, (int)(2*r), (int)(2*r), 0, 0);
		radius = r;
		Ycoord = Y;
		Xcoord = X;
		xCoords = new int[10];
		yCoords = new int[10];
		double innerRadius = radius*Math.sin(Math.toRadians(18)/Math.sin(Math.toRadians(54)));
		for (int i = 18; i < 360; i += 72) {
			xCoords[(i-18)/36]  = Xcoord + (int) (radius * Math.cos(Math.toRadians(i)));
			yCoords[(i-18)/36] = Ycoord - (int) (radius * Math.sin(Math.toRadians(i))); 
		}
		for (int i = 54; i < 360; i += 72) {
			xCoords[(i-18)/36] = Xcoord + (int) (innerRadius * Math.cos(Math.toRadians(i)));
			yCoords[(i-18)/36] = Ycoord - (int) (innerRadius * Math.sin(Math.toRadians(i))); 
		}
	}
	
	public void paintComponent(Graphics window, Color c) {
		window.setColor(c);
		window.fillPolygon(new Polygon(xCoords, yCoords, xCoords.length));
	}
}
