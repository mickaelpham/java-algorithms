package tree;

public class Node {

	// Data used as key value.
	public int iData;
	
	// Other data.
	public double fData;
	
	// The node's children.
	public Node leftChild;
	public Node rightChild;
	
	public Node(int id, double dd) {
		iData = id;
		fData = dd;
	}
	
	public String toString() {
		return "{" + iData + ": " + fData + "}";
	}
	
	public boolean isLeaf() {
		return leftChild == null && rightChild != null;
	}
}
