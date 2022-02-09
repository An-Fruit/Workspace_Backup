import java.util.*;

public class Node
{
   int value;
   Node next;

   public Node( int v, Node n)
   {
      value = v;
      next = n;
   }

   public String toString()
   {
      return "" + value + " " + next;
   }
}
