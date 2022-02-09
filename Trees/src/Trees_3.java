import java.util.*;

public class Trees_3
{
   public static void main(String[] args)
   {
      Node pat = new Node( 77, null, null ); //right node
      Node sam = new Node( 44, null, null ); //left node
      Node wil = new Node( 11, sam, pat );

      while( wil != null)
      {
         System.out.println( wil.data );
         wil = wil.left;
      }
      
   }
}
