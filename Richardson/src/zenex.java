import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class zenex
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int items = file.nextInt();
		file.nextLine();
		Queue<String> stuff = new LinkedList<String>();
		for(int i = 0; i < items; i++) {
			String s = file.nextLine().trim();
			
			stuff.offer(s);
		}
		
		int times = file.nextInt();
		Queue<String> order = new LinkedList<String>();
		for(int i = 0; i < times; i++) {
			String[] word = file.next().split("");
			String type = word[word.length - 1];
			int str;
			if(word.length == 3) {
				 str = Integer.parseInt(word[0] + word[1]);
			}
			else {
				str = Integer.parseInt(word[0]);
			}
			ArrayList<String> out = new ArrayList<>();
			String put = "";
			if(type.equals("o")) {
				for(int k = 0; k < str; k++) {
						String s = stuff.poll();
						order.offer(s);
						put += s + ", ";
						
				}
				put += "ordered";
			}
			else {
				for(int k = 0; k < str; k++) {
						String s = order.poll();
						put += s + ", ";
				}
				put += "shipped";
			
			}
			System.out.println(put);
		}
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new zenex().run();
	}	
	
}
