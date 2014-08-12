package tree;

public class Tree {

	private Node root;
	
	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if (current.iData < key)
				current = current.leftChild;
			else
				current = current.rightChild;
			
			if (current == null)
				return null; // Didn't find it.
		}
		return current; // Found it.
	}
	
	public void insert(int id, double dd) {
		Node newNode = new Node(id, dd);
		
		// No node in root (= tree empty)?
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;

			// Infinite loop, exits internally.
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.leftChild;
					// If end of the line.
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void print() {
		print(root);
		System.out.println("");
	}
	
	private void print(Node localRoot) {
		if (localRoot != null) {
			print(localRoot.leftChild);
			System.out.print(localRoot.toString() + " ");
			print(localRoot.rightChild);
		}
	}
	
	public void delete(int id) {
		
	}
	
}
