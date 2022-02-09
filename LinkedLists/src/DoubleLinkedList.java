public class DoubleLinkedList
{
	private class Node {  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int val, Node n, Node p) {  
            item = val;
            next = n;
            previous = p;
        }  
    }  
	
	
   private Node front;
   private Node back;
 
   //add a constructor
   public DoubleLinkedList(Node n) {
	   front = n;
	   back = n;
   }
   
   public DoubleLinkedList() {
	   front = null;
	   back = null;
   }
   
   
   //add method
    //add a new node containing val to the front of the list
   	
   	public void addFront( int val ) {
   		if(front == null) {
   			front = back = new Node(val, null, null);
   			front.next = front;
   			front.previous = front;
   			back.next = front;
   			back.previous = front;
   			return;
   		}
   		Node current = front;
   		front = new Node(val, current, back);
   		back.next = front;
   		return;
   }

   	
   	
   //add last method
   	//make an addLast method to add to the end of the list
   	
   	public void addLast( int val ){
   		if(front == null) {
   			front = back = new Node(val, null, null);
   			front.next = front;
   			front.previous = front;
   			back.next = front;
   			back.previous = front;
   			return;
   		}
   		
   		Node tail = back;
   		back = new Node(val, front, tail);
   		tail.next = back;
   		front.previous = back;
   		return;
   	}


   
   //delete method
    //deletes first occurence of val
   	
   	public boolean delete( int val ) {
   		
   		Node current = front;
   		Node previous;
   		if(front.item == val) {
   			front = current.next;
   			back.next = current.next;
   			return true;
   		}
   		
   		
   		
   		while(current.next != front) {
   			previous = current;
   			current = current.next;
   			if(current.item == val) {
   				previous.next = current.next;
   				return true;
   			}
   		}
   		return false;
	}
   
   
   
 
   //find method
    //return the index of a specified value in the list 
    //return -1 if not found
    public int find( int val ) {
    	boolean found = false;
    	int index = 0;
    	Node current = front;
    	while(current.next != front) {
    		if(current.item == val) {
    			found = true;
    			return index;
    		}
    		current = current.next;
    		index++;
    	}
    	return -1;
	}
   
   

   
   //doubleFirst
     //add a new node to the front of the list with the same value of the first node
     //[ 3, 4, 6]  would become  [3, 3, 4, 6]
     
     public void doubleFirst(){
    	addFront(front.item);
     }
   
   

   
   //doubleLast
     //same as doubleFirst except you are doubling the last node 
     //[ 3, 4, 6]  would become  [3, 4, 6, 6] 
     public void doubleLast() {
    	  addLast(back.item);
    }



   //print / toString method
    //print / return all values in the list
    
    //void print()
    public String toString() {
    	String s = "";
    	Node current = front;
    	
    	while(current.next != front) {
    		s += " " + current.item;
    		current = current.next;
    	}
    	s += " " + current.item;
    	
    	return s;
    }
   //this is just a comment to test something
   
}

