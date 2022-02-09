import java.util.*;

public class LinkedLists_3
{
		//countNum will count the occurrences of val in linked list n
		//return 0 of val does not appear at least 1 time
   public static int countNum( Node n, int val )
   {
	   int sum = 0;
	 Node s = n;
	 while(s != null) {
		 if(s.value == val) sum++;
		 s = s.next;
	 }
	 
      return sum;
   }
   
   	 	//return the sum of all values in the linked list n
   	 	//return 0 if there are no nodes in linked list n
   public static int sumEmAll( Node n )
   {
	  int sum = 0;
	  Node s = n;
	  while(s != null) {
		  sum+= s.value;
		  s = s.next;
	  }
      return sum;
   }

   public static void main(String[] args)
   {
      Node bob = new Node(3, null);
      Node ann = new Node(7, bob);
      Node fred = new Node(3, ann);
      Node cathy = new Node(3, fred);      
      Node sue = new Node(4, cathy);
      Node a = new Node(3, sue);
      Node b = new Node(3, a);

      System.out.println( countNum( b, 3 ) );     //should output 5
      
      System.out.println( sumEmAll( b ) );     //should output 26    
   }
}
