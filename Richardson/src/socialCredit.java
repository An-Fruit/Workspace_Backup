import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class socialCredit
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		String[] vals = file.next().split(",");
		int cols = Integer.parseInt(vals[0]);
		int rows = Integer.parseInt(vals[1]);
		int times = file.nextInt();
		char[][] mat = new char[rows][cols];
		for(int r = 0; r < mat.length; r++) {
			for(int c = 0; c < mat[r].length; c++) {
				mat[r][c] = '+';
			}
		}
		
		for(int i = 0; i < times; i++) {
			String[] val = file.next().split(",");
			
			int workCol = Integer.parseInt(val[0]);
			int workRow = Integer.parseInt(val[1]);
			mat[workRow][workCol] = '0';
			if(workRow == 0 && workCol == 0 && cols == 1 && rows == 1) {
				mat[workRow][workCol] = '0';
			}
			else {
				if (workRow != 0 && workRow != rows - 1 && workCol != 0 && workCol != cols - 1) {
					mat[workRow + 1][workCol] = '0';
					mat[workRow - 1][workCol] = '0';
					mat[workRow][workCol + 1] = '0';
					mat[workRow][workCol - 1] = '0';
				}
				
				if(workRow == 0) {
					if(workCol != 0) {
						mat[workRow][workCol - 1] = '0';
						
					}
					if(workCol != cols - 1) {
						mat[workRow][workCol + 1] = '0';
						
					}
					mat[workRow + 1][workCol] = '0';
					
				}
				
				else if (workRow == rows - 1) {
					if(workCol != 0) {
						mat[workRow][workCol - 1] = '0';
					}
					if(workCol != cols - 1) {
						mat[workRow][workCol + 1] = '0';
					}
					mat[workRow - 1][workCol] = '0';
					
				}
				
				 if(workCol == 0) {
					if(workRow != 0) {
						mat[workRow - 1][workCol] = '0';
					}
					if(workRow != rows - 1) {
						mat[workRow + 1][workCol] = '0';
					}
					mat[workRow][workCol + 1] = '0';
				}
				
				else if(workCol == cols - 1) {
					if(workRow != 0) {
						mat[workRow - 1][workCol] = '0';
					}
					if(workRow != rows - 1) {
						mat[workRow + 1][workCol] = '0';
					}
					mat[workRow][workCol - 1] = '0';
					
				}
			}
			
			
		
			
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int k = 0; k < mat[i].length; k++) {
				System.out.print(mat[i][k]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new socialCredit().run();
	}	
	
}
