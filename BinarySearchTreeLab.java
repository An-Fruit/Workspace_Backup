import java.util.*;

public class BinarySearchTreeLab
{
	public class Node
	{
	   int data;
	   Node left;
	   Node right;

	   public Node( int v, Node l, Node r)
	   {
	      data = v;
	      left = l;
	      right = r;
	   }

	   public String toString()
	   {
	      return "" + data + " " + left + " " + right;
	   }
	}

   public Node root;
   private String print;
   //constructor
   public BinarySearchTreeLab() {
	   print = "";
   }
   
   
   //add method
   
   public void add( int o )
	{
		root = add( o, root );		
	}
	
	private Node add( int o, Node n )
	{
		if(n == null) {
			n = new Node(o, null, null);
		}
		else if(n.data > o) {
			n.left = add(o, n.left);
		}
		else if(n.data < o) {
			n.right = add(o, n.right);
		}
		
		return n;
	}
	
	public void remove(int o) {
		root = remove(root, o);
	}
	private Node remove(Node n, int o) {
		if(n == null) return null; 
		if(o == n.data) {
			if(n.left == null && n.right == null) {
				return null;
			}
			else if(n.left == null || n.right == null) {
				if(n.left == null) {
					return n.right;
				}
				else {
					return n.left;
				}
			}
			else if (n.left != null && n.right != null){
				int smallestValue = smallest(n.right);
				n.data = smallestValue;
				n.right = remove(n.right, smallestValue);
				return n;
			}
			
		}
		else if(n.data > o) {
			n.left = remove(n.left, o);
		}
		else if(n.data < o) {
			n.right = remove(n.right, o);
		}
	
		return n;
	}
	

	private void inOrder(Node n) {
		
		if(n != null) {
			inOrder(n.left);
			print += n.data + " ";
			inOrder(n.right);
		}
		return;
		
	}
	
	private void preOrder(Node n) {
		
		if(n != null) {
			print += n.data + " ";
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
	private void postOrder(Node n) {
		
		if(n != null) {
			print += n.data + " ";
			postOrder(n.right);
			postOrder(n.left);
		}
	}
	
	public boolean find (int val) {
		return find(root, val);
	}
	private boolean find(Node n, int val) {
		if(n!= null) {
			if(n.data == val) return true;
			else if(n.data > val) {
				return find(n.left, val);
			}
			else if(n.data < val) {
				return find(n.right, val);
			}
		}
		
		return false;
	}
	
	public String toString() {
		print = "";
		preOrder(root);
		return print;
	}
	
	public int largest() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		return largest(root);
	}
	
	private int largest(Node n) {
		return n.right == null ? n.data : largest(n.right);
	}
	
	public int smallest() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		return smallest(root);
	}
	
	private int smallest(Node n) {
		 return n.left == null ? n.data : smallest(n.left);
	}

	 /*
	    70   -  add + traversals – inOrder, preorder, postOrder, revOrder
	    
        80   -  70  + remove, smallest, largest, find
        
        90   -  80  + sumNodes, countLeaves, levelOrder traversal [ use a Q ], and isBST [ is the tree a binary search tree ]
        
        100  -  90  + getHeight, getWidth, isFull, and isComplete
        
        110  -  100 + mirror [ return a new tree ] + 
                    printem tree where it lookem like tree 
                    
    */

}
