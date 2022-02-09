import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class UILTest
{
	public void run() throws Exception
	{
		int x = 1;
		while(x <= 5) {
			switch(x) {
			case 1:
			case 2: x++;break;
			case 3: x += 2; break;
			case 4: x = 1; break;
			case 5 : x++;break;
			default:x=1;
			}
		}
		System.out.print(x);
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new UILTest().run();
	}	
	
}