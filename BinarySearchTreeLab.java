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
   private int order;
   private String print;
   //constructor
   public BinarySearchTreeLab() {
	   print = "";
	   //set to inorder
	   order = 2;
   }
   
   
   //add method
   public void setOrder(int val) {
	   if(val != 1 && val != 2 && val != 3) throw new IllegalArgumentException();
	   order = val;
   }
   //working
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
	//working
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
	
	//working
	private void inOrder(Node n) {
		
		if(n != null) {
			inOrder(n.left);
			print += n.data + " ";
			inOrder(n.right);
		}
		return;
		
	}
	//working
	private void preOrder(Node n) {
		
		if(n != null) {
			print += n.data + " ";
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	//working
	private void postOrder(Node n) {
		
		if(n != null) {
			print += n.data + " ";
			postOrder(n.right);
			postOrder(n.left);
		}
	}
	//working
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
	//working
	public String toString() {
		print = "";
		if(order == 1) {
			preOrder(root);
		}
		else if(order == 2) {
			inOrder(root);
		}
		else {
			postOrder(root);
		}
		return print;
	}
	//working
	public int largest() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		return largest(root);
	}
	
	private int largest(Node n) {
		return n.right == null ? n.data : largest(n.right);
	}
	//working
	public int smallest() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		return smallest(root);
	}
	
	private int smallest(Node n) {
		 return n.left == null ? n.data : smallest(n.left);
	}
	
	public int sumNodes() {
		if(root == null) throw new NoSuchElementException();
		return sumNodes(root);
	}
	private int sumNodes(Node n) {
		if(n == null) return 0;
		return n.data + sumNodes(n.left) + sumNodes(n.right);
	
	}
	//TODO: finish this method - it's not done yet
	public int countLeaves() {
		if(root == null) throw new NoSuchElementException();
		return countLeaves(root);
	}
	private int countLeaves(Node n) {
		if(n == null) return 0;
		if(n.left == null && n.right == null) return 1;
		return countLeaves(n.left) + countLeaves(n.right);
		
		
	}
	 /*
	    70   -  add + traversals – inOrder, preorder, postOrder, revOrder
	    
        80   -  70  + remove, smallest, largest, find
        
        90   -  80  + sumNodes, countLeaves, levelOrder traversal [ use a Q ], and isBST [ is the tree a binary search tree ]
        
        100  -  90  + getHeight, getWidth, isFull, and isComplete
        
        110  -  100 + mirror [ return a new tree ] + 
                    printem tree where it lookem like tree 
                    
    */
	public static void main(String[] args) throws Exception{
		BinarySearchTreeLab test = new BinarySearchTreeLab();
		int[] nums = new int[] {20, 18, 35, 200, 19, 24};
		for(int num: nums) test.add(num);
		System.out.println(test.countLeaves());
	}
}
