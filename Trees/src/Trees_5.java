import java.util.*;

class Tree
{	
	Node root;
	
	public Tree()
	{
		root = null;
	}
	
	public void add( Comparable o )
	{
		root = add( o, root );		
	}
	
	private Node add( Comparable o, Node n )
	{
		if(n == null) {
			n = new Node(o, null, null);
		}
		else if(n.data.compareTo(o) > 0) {
			n.left = add(o, n.left);
		}
		else if(n.data.compareTo(o) < 0) {
			n.right = add(o, n.right);
		}
		
		//complete this method
		return n;
	}
	
	
	public void inOrder()
	{
	   inOrder( root );	
	}
	
	private void inOrder( Node t )
   {
      if( t != null)
      {
         inOrder( t.left );
         System.out.print( t.data + " "  );
         inOrder( t.right );
      }
   }	
}

public class Trees_5
{
   public static void main(String[] args)
   {
   	int[] cases = {23, 56, 89, 11, 33 };
      Tree test = new Tree();
      for( int item : cases )
      {
         test.add( item );
      }
      test.inOrder();    //should print 11 23 33 56 89 
   }
}
