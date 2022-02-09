import java.util.*;

public class Trees_2
{
   public static void main(String[] args)
   {
		Node pat = new Node( 77, null, null );  //right leaf node
		System.out.println( pat );
		
		Node sam = new Node( 44, null, null ); //left leaf node
		System.out.println( sam );
		
		Node bob = new Node( 11, sam, pat );
		System.out.println( bob ); //in order traversal
   }
}
