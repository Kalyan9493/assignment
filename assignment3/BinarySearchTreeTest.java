package assignment3;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void test() {
		
		//1)---CREATING A BINARY SEARCH TREE-----
		
		BinarySearchTree tree = new BinarySearchTree();
		 	
		 //2)-----INSERTING ELEMENTS IN TO TREE-----
		 
		 	tree.insert(50); 
	        tree.insert(30); 
	        tree.insert(20); 
	        tree.insert(40); 
	        tree.insert(70); 
	        tree.insert(60); 
	        tree.insert(80); 
	  
	      //3)----TRAVERSING TREE IN INORDER(),PREORDER(),POSTORDER()
	        System.out.print("InOrder Traversal:");
	        tree.printInorder(tree.root);
	        System.out.println();
	        System.out.print("PreOrder Traversal:");
	        tree.printPreorder(tree.root);
	        System.out.println();
	        System.out.print("PostOrder Traversal:");
	        tree.printPostorder(tree.root);
	        System.out.println();
	        
	       //4)--SEARCHING AN ELEMENT IN BST-----
	        
	        System.out.println(tree.search(tree.root, 20)+" is found");
	        
	     //5)---DELETE ELEMENT FROM BST----
	        tree.deleteKey(20);
	        
	      // ---TREE AFTER DELETING ELEMENT
	        System.out.println("After deleting element tree is:");
	        tree.printInorder(tree.root);
	        
	      //6)---HEIGHT OR DEPTH OF TREE---
	        System.out.println();
	        System.out.println("Height of tree is:"+tree.maxDepth(tree.root));
	        
	      //7)---NUMBER OF LEAVES---
	        System.out.println("Number of leaves are:"+tree.getLeafCount(tree.root));
	        
	        
	}
	

}
