package ch17;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf = new ArrayList<String>();
	
	public Shelf() {}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
