import java.util.*;

public class BinarySearchTreeLab_Runner
{
   public static void main(String[] args)
   {
		int[] cases = { 90, 10, 87, 33, 24, 56, 22, 66, 221, 455, 11, -90, 3, 4, 5, 6, 7, -9, 100, 200, 300};
		
		BinarySearchTreeLab lab = new BinarySearchTreeLab();
		//for each loop through cases
			//add each value from case to the tree
			//print the tree after each add
			for(int num : cases) {
				lab.add(num);
				//System.out.println(lab);
			}
			System.out.println(lab);
			System.out.println(lab.smallest());
			System.out.println(lab.largest());
			//System.out.print(lab);
		//print the tree after all adds
			//use in order
			//use pre order
			//use post order
			//use reverse order
		
		//for each loop through cases
			//delete each value from the tree
			//print the tree after each add				

   }
}
