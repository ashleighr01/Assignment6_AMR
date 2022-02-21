/**
 * 
 * Application class used to implement the Depth First Search, Node, and Tree
 * classes to traverse through a tree, print the nodes, and total out
 * traversals.
 * 
 * @author Ashleigh Rufus
 * CS-215-ON: Assignment 6.1
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args) {
		
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree = new Tree();//Creates a tree with root
		Node root = aTree.generatePracticeTree(5); // The tree generated will have a height of 5
		DepthFirstSearch aSearch = new DepthFirstSearch();
		
		/*
		 * The DFS method will be implemented to search and traverse through
		 * the tree while returning the value of each node 
		 */
		
		System.out.println("\n-----The tree will now be traversed showing each node's value----");
		aSearch.DFS(root);
		
		/*
		 * The nodesTraversed method will be implemented to return the number
		 * of nodes traversed 
		 */
		
		System.out.println("\nThe number of nodes traversed: " + aSearch.nodesTraversed());
	
		/*
		 * The getHeight method will be implemented to return the height of the
		 * created tree. 
		 */
		
		System.out.println("\nThe height of the tree is: " + aTree.getHeight());
		
		
	} // end of main

} // end of Application

