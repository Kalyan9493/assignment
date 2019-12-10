package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepthOfTheDAGTest {

	@Test
	public void test() {
		  DepthOfTheDAG g=new DepthOfTheDAG(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	        g.findDepth(3);
	}

}
