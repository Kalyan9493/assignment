package assignment4;

import org.junit.Test;

public class TopologicalOrderTest {

	@Test
	public void test() {
		 // Create a graph given in the above diagram 
        TopologicalOrder g=new TopologicalOrder(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
        System.out.println("Following is a Topological Sort"); 
        g.topologicalSort(); 
  
	}

}
