package assignment3;

public class BinarySearchTree {
	 /* Class containing left and right child of current node and key value*/
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
     Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
     Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
     void printPostorder(Node node) 
     { 
         if (node == null) 
             return; 
   
         // first recur on left subtree 
         printPostorder(node.left); 
   
         // then recur on right subtree 
         printPostorder(node.right); 
   
         // now deal with the node 
         System.out.print(node.key + " "); 
     } 
   
     /* Given a binary tree, print its nodes in inorder*/
     void printInorder(Node node) 
     { 
         if (node == null) 
             return; 
   
         /* first recur on left child */
         printInorder(node.left); 
   
         /* then print the data of node */
         System.out.print(node.key + " "); 
   
         /* now recur on right child */
         printInorder(node.right); 
     } 
   
     /* Given a binary tree, print its nodes in preorder*/
     void printPreorder(Node node) 
     { 
         if (node == null) 
             return; 
   
         /* first print data of node */
         System.out.print(node.key + " ");
        
   
         /* then recur on left sutree */
         printPreorder(node.left); 
   
         /* now recur on right subtree */
         printPreorder(node.right); 
     } 
    
 // A utility function to search a given key in BST 
    public int search(Node root, int key) 
    { 
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root.key;
        
            // val is greater than root's key 
            if (root.key > key) 
            	return search(root.left, key); 
            else		// val is less than root's key 
            	return search(root.right, key);
        
    } 
 // This method mainly calls deleteRec() 
    void deleteKey(int key) 
    { 
        root = deleteRec(root, key); 
    } 
  
    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
    } 
    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
    
    /* Compute the "maxDepth" of a tree -- the number of  
       nodes along the longest path from the root node  
       down to the farthest leaf node.*/
    int maxDepth(Node node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    }
    //COUNTS number of leaves
    int getLeafCount()  
    { 
        return getLeafCount(root); 
    } 
   
    int getLeafCount(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        else
            return getLeafCount(node.left) + getLeafCount(node.right); 
    } 
   
}
