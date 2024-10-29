public class app
{

  public static void main (String[]args) throws Exception
  {
    linkedlist ll = new linkedlist();
      ll.insert (97);
      ll.insert (53);
      ll.insert (21);
      ll.insert (16);

      System.out.println ("Linked List before Insertion");

      ll.display ();

      ll.sortedInsert (7);

      System.out.println ("Linked List after Insertion");

      ll.display ();
  }

}

