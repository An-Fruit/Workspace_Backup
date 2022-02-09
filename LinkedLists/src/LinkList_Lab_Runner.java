import java.util.*;

public class LinkList_Lab_Runner
{
	
   public static void main(String[] args)
   {
		int[] cases = { 90, 10, 87, 33, 24, 56, 22, 66, 221, 455, 11, -90, 3, 4, 5, 6, 7, -9, 100, 200, 300};
		
		//make a new LinkList_Lab 
		DoubleLinkedList lab = new DoubleLinkedList();
		
		//for each loop through cases		
		for( int item : cases )
		{
			lab.addLast(item);
			System.out.println(lab);
			
		}
		System.out.println(lab);

		//print the list after all add
		//call doubleFirst
//		lab.doubleFirst();
////		//print the list
//		System.out.println(lab);
////		//call doubleLast
//		lab.doubleLast();
////		//print the list
//		System.out.println(lab);
//		
//		//call find to search for a particular value
		System.out.println(lab.find(56));
//		//call find again to search for a value that is not in the list
		System.out.println(lab.find(429));
//		//for each loop through cases
		System.out.println(lab);
		
		for(int num: cases) {
			lab.delete(num);
			System.out.println(lab);
		}
		//System.out.println(lab);
		
			//delete each value from the list
			//print the list after each add	
   }
}
