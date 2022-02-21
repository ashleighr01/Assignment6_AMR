/**
 * DepthFirstSearch Class used to create the process of traversing the 
 * nodes within a tree
 * 
 * @author Ashleigh Rufus
 * CS-215-ON: Assignment 6.1
 *
 */
public class DepthFirstSearch {

	 Node root;
	 private int traverseGrowth;
	 
	 public DepthFirstSearch() {
		 
    	 System.out.println("Call DFS with root node to do a Depth First Search.");
     } //end empty-argument constructor
	 
	 /**
	  * DFS method used to traverse the created tree in the Application class
	  * in a depth-first manner. 
	  * @param node that will be created in the Application class and traversed here
	  */
	 public void DFS(Node node) {

		 System.out.println("\nThe node traversed is: " + node.getData()); 
		 
		 /**
		  * traverseGrowth will be incremented within the DFS method to keep track
		  * of the nodes that are traversed for the created tree
		  */
		 traverseGrowth++;
                
		 /**
		  * An if-else statement used to call each node as well as show if the node
		  * is a leaf
		  */
		 if ((node.getlChild()) == null && (node.getrChild()) == null) {
			 System.out.println("The node above is a leaf.");
		 } else {
			DFS(node.getlChild());
			DFS(node.getrChild());
		 } //end if-else loop
		 

      } //end DFS

	 /**
	  * nodesTraversed method used to return the number of nodes traversed
	  * @return integer of traverse growth tracked in DFS method
	  */
	 public int nodesTraversed() {
		 return traverseGrowth;
	 } //end nodesTraversed
	 
} //end DepthFirstSearch

