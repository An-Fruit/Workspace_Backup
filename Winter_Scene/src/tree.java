import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class tree extends Thing
{
	private int midX, topY, width, height;
	private int[] xArr;
	private int[] yArr;
	private ArrayList<Light> lights;
	private Timer time;
	private int delay;
	private Color c;
	private JButton blu = new JButton("Blue");
	private JButton red = new JButton("Red");
	private JButton start = new JButton("Start"); //button to start light show
	private JButton stop = new JButton("Stop"); //button to stop light show
	private JButton reset = new JButton("Reset"); //button to reset the tree panel
	private boolean blink = false;
	
	public tree(int w, int h, int mx, int tY) {
		super(mx - w, tY, w, h + 50, 0, 0);
		midX = mx;
		topY = tY;
		width = w;
		height = h;
		xArr = new int[] {midX, midX + (width/3), midX + (width/6), midX + (width * 2/3), midX + (width/3), midX + width, midX - width, midX - (width/3), midX - (width * 2/3), midX - (width/6), midX - (width/3)};
		yArr = new int[] {topY, topY+(height/3), topY+(height/3), topY+(height*2/3), topY+(height*2/3), topY+height, topY+height, topY+(height*2/3), topY+(height*2/3), topY+(height/3), topY+(height/3)};
		lights = new ArrayList<>();
		    
	}
	public int getMid() {
		return midX;
	}
	public int getTop() {
		return topY;
	}
	public void paintComponent(Graphics window) {
		Polygon tree = new Polygon(xArr, yArr, xArr.length);
		
		window.setColor(Color.BLACK);
		window.drawPolygon(tree);
		window.setColor(new Color(6, 79, 14));
		window.fillPolygon(tree);
		window.setColor(new Color(77, 27, 5));
		window.fillRect(midX-(width/10), topY+height, width/5, height/5);
		
		 if (blink == false){
		    	window.setColor(Color.red);
		    	for (Light l : lights) {
		    		l.paintComponent(window);
		    	}
		    }
	}
	
}
