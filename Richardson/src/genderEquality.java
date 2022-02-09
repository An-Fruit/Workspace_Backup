import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class genderEquality
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int f = file.nextInt();
		int m = file.nextInt();
		if(f < m) {
			int i = (int)(Math.abs(f - m));
			System.out.println("We must hire " + i + " more female employees.");
		}
		else if(f > m) {
			int i = (int)(Math.abs(m - f));
			System.out.println("We must hire " + i + " more male employees.");
		}
		else {
			System.out.println("We've achieved equality! No need to hire." );
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new genderEquality().run();
	}	
	
}
