import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class genderWage
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);

		double s = (double)file.nextLong();
		double t = (double)(file.nextInt())/100;
		System.out.println((int)(Math.floor(s * t)));
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new genderWage().run();
	}	
	
}
