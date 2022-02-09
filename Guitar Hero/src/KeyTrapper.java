import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;
/*
 * Name: Andre Zhang
 * Partner Name: Thanh Duong
 * 
 * 
 * 
 * 
 */
public class KeyTrapper extends Canvas implements KeyListener
{
	private String key;
	private GuitarStringTester Guitar;
	
	
		//this is the constructor

	
	public KeyTrapper( )
	{	
		key = "";
		Guitar  = new GuitarStringTester();
		addKeyListener( this );
		setFocusable( true );
	}

	public void paint( Graphics window )
	{	
		window.drawString( "Keys Played: " + key, 250, 250 );
			
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
		
	public void keyPressed(KeyEvent e)
	{
		key += e.getKeyChar()+"";		
	}
				
	public void keyReleased(KeyEvent e)
	{
		
		Guitar.playNotes(key);
		key ="";
		repaint();
	}



	
	

}