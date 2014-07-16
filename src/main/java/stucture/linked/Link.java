package stucture.linked;

public class Link {

	public int iData;
	public double dData;

	// Reference to the next link.
	public Link next;

	// Constructor.
	public Link(int id, double dd) {
		iData = id;
		dData = dd;
		
		// Not required but more explicit.
		next = null;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "}");
	}

}
