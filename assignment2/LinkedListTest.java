package assignment2;

import org.junit.Test;

public class LinkedListTest {

	private int a;

	@Test
	public void test() {
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // A)******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
        list = LinkedList.insert(list, 6); 
        list = LinkedList.insert(list, 7); 
        list = LinkedList.insert(list, 8); 
  
        //B)-----DISPLAY LIST------
        LinkedList.displayList(list); 
        
        //C)-------DELETION BY KEY--------
        //
        LinkedList.deleteByKey(list, 1);
        LinkedList.deleteByKey(list, 4);
        LinkedList.displayList(list); 
        
        //D)-----SEARCHING FOR ELEMENT-----
        if (list.search(LinkedList.head, 2)) {
        	System.out.println();
            System.out.println("Key Found");
        }
        else
            System.out.println("Key Not Found"); 
        
        //E)------SIZE OF LIST-------
        
        a = LinkedList.listSize();
        System.out.println("Size of list is:" + a);
        
        
       
        
	}

}
