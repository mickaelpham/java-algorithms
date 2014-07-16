package stucture.linked;

public class Link {

	private int iData;
	private double dData;

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
	
	public int getIData() {
		return iData;
	}
	
	public double getDData() {
		return dData;
	}

}
