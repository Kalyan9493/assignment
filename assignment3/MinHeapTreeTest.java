package assignment3;

import org.junit.Test;

public class MinHeapTreeTest {

	@Test
	public void test() {
		
		//1)---CREATING A MINHEAP TREE---
		 System.out.println("The Min Heap is "); 
	        MinHeapTree minHeap = new MinHeapTree(15);
	        
	        
	   //2)---INSERTING ELEMENTS TO MIN HEAP TREE--
	        minHeap.insert(5); 
	        minHeap.insert(3); 
	        minHeap.insert(17); 
	        minHeap.insert(10); 
	        minHeap.insert(84); 
	        minHeap.insert(19); 
	        minHeap.insert(6); 
	        minHeap.insert(22); 
	        minHeap.insert(9); 
	        minHeap.minHeap(); 
	  //3)--PRINTING MIN HEAP TREE----
	        minHeap.print(); 
	        
	   //4)---MINIMUM HEAP TREE---
	        System.out.println("The Min val is " + minHeap.remove()); 
	    } 
}
