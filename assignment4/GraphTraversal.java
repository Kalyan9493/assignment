package assignment4;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTraversal {
	 private int V;   // No. of vertices 
	  
	    // Array  of lists for Adjacency List Representation 
	    private LinkedList<Integer> adj[]; 
	  
	    // Constructor 
	    GraphTraversal(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    //Function to add an edge into the graph 
	    void addEdge(int v, int w) 
	    { 
	        adj[v].add(w);  // Add w to v's list. 
	    } 
	  
	    // A function used by DFS 
	    void DFSUtil(int v,boolean visited[]) 
	    { 
	        // Mark the current node as visited and print it 
	        visited[v] = true; 
	        System.out.print(v+" "); 
	  
	        // Recur for all the vertices adjacent to this vertex 
	        Iterator<Integer> i = adj[v].listIterator(); 
	        while (i.hasNext()) 
	        { 
	            int n = i.next(); 
	            if (!visited[n]) 
	                DFSUtil(n, visited); 
	        } 
	    } 
	  
	    // The function to do DFS traversal. It uses recursive DFSUtil() 
	    void DFS(int v) 
	    { 
	        // Mark all the vertices as not visited(set as 
	        // false by default in java) 
	        boolean visited[] = new boolean[V]; 
	  
	        // Call the recursive helper function to print DFS traversal 
	        DFSUtil(v, visited); 
	    } 
	    
	    
	    
	    // BFS TRAVERSAL
	    // prints BFS traversal from a given source s 
	    void BFS(int s) 
	    { 
	        // Mark all the vertices as not visited(By default 
	        // set as false) 
	        boolean visited[] = new boolean[V]; 
	  
	        // Create a queue for BFS 
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        // Mark the current node as visited and enqueue it 
	        visited[s]=true; 
	        queue.add(s); 
	  
	        while (queue.size() != 0) 
	        { 
	            // Dequeue a vertex from queue and print it 
	            s = queue.poll(); 
	            System.out.print(s+" "); 
	  
	            // Get all adjacent vertices of the dequeued vertex s 
	            // If a adjacent has not been visited, then mark it 
	            // visited and enqueue it 
	            Iterator<Integer> i = adj[s].listIterator(); 
	            while (i.hasNext()) 
	            { 
	                int n = i.next(); 
	                if (!visited[n]) 
	                { 
	                    visited[n] = true; 
	                    queue.add(n); 
	                } 
	            } 
	        } 
	    }
	    
	    
	    // Finding path between nodes
	    //prints BFS traversal from a given source s 
	    Boolean isReachable(int s, int d) 
	    { 
	        LinkedList<Integer>temp; 
	  
	        // Mark all the vertices as not visited(By default set 
	        // as false) 
	        boolean visited[] = new boolean[V]; 
	  
	        // Create a queue for BFS 
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        // Mark the current node as visited and enqueue it 
	        visited[s]=true; 
	        queue.add(s); 
	  
	        // 'i' will be used to get all adjacent vertices of a vertex 
	        Iterator<Integer> i; 
	        while (queue.size()!=0) 
	        { 
	            // Dequeue a vertex from queue and print it 
	            s = queue.poll(); 
	  
	            int n; 
	            i = adj[s].listIterator(); 
	  
	            // Get all adjacent vertices of the dequeued vertex s 
	            // If a adjacent has not been visited, then mark it 
	            // visited and enqueue it 
	            while (i.hasNext()) 
	            { 
	                n = i.next(); 
	  
	                // If this adjacent node is the destination node, 
	                // then return true 
	                if (n==d) 
	                    return true; 
	  
	                // Else, continue to do BFS 
	                if (!visited[n]) 
	                { 
	                    visited[n] = true; 
	                    queue.add(n); 
	                } 
	            } 
	        } 
	  
	        // If BFS is complete without visited d 
	        return false; 
	    } 

}
