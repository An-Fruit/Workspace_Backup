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
		System.out.println(cases.length);
			for(int num : cases) {
				lab.add(num);
				//System.out.println(lab);
			}
			System.out.println(lab);
			int t = 0;
			for(int i : cases) {
//				t++;
//				System.out.println(t + " " + lab.find(i));
				lab.remove(i);
				System.out.println(lab);
			}
			System.out.println(lab + " fin");
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
