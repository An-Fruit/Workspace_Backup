import java.awt.Point;
import java.io.File;
import java.util.*;

public class ShortestDijkstra {
		
		char[][] mat;
		boolean found;
		int min;
		int[][] shadow;
		
		//recursive method to find the shortest path from the given starting point to the end point
		public void go(int r,int c,int steps)
		{
			
			if(r < mat.length && c < mat[r].length && r >= 0 && c >= 0 && mat[r][c] != '0'  && steps <= shadow[r][c]  )
			{
				char sub = mat[r][c];
				if(mat[r][c] == 'E')
				{
					found = true;
					shadow[r][c] = steps;
					return;
				}
				
				shadow[r][c] = steps;
				
				go(r,c - 1,steps + 1);
				go(r,c + 1, steps + 1);
				go(r - 1,c,steps + 1);
				go(r + 1,c,steps + 1);
				//restores previous state so we don't change the entire matrix into something unrecognizable
				mat[r][c] = sub;
			}
			
			
		}
		
		public void run()throws Exception
		{
			Scanner file = new Scanner(System.in);
			int times  = file.nextInt();
			file.nextLine();
			for(int i = 0; i < times; i++)
			{
				int rows = file.nextInt();
				int cols = file.nextInt();
				
				found = false;
				min = Integer.MAX_VALUE;
				mat = new char[rows][cols];
				shadow = new int[rows][cols];
				//fills shadow matrix w/ max values to prevent recursion from going to random places
				for(int r = 0; r < shadow.length;r++)
				{
					for(int c = 0; c < shadow[r].length;c++)
					{
						shadow[r][c] = Integer.MAX_VALUE; 
					}
				}
				
				//fills matrix with values
				for(int m = 0; m < rows; m++)
				{
					mat[m] = file.nextLine().trim().toCharArray();
				}
				
				
			
				//finds the starting point and runs recursion from there
				for(int t = 0; t < mat.length; t++) {
					for(int k = 0; t < mat[t].length; k++) {
						if(mat[t][k] == 'S') {
							go(t, k, 0);
						}
					}
				}
				//prints whether path is available or not
				if(found)
				{
					System.out.println("FOUND");
				}
				else
				{
					System.out.println("NOT FOUND");
				}
			
			}
			
			
			
			
		}
		
		public static void main(String[] args)throws Exception
		{
			ShortestDijkstra x = new ShortestDijkstra();
			x.run();
		}
}
