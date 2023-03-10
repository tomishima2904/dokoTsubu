package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private String name;
	private String mutter;
	
	public Mutter () {}
		
	public Mutter (String name, String mutter) {
		this.name = name;
		this.mutter = mutter;
	}
	
	public String getName () { return name; }
	public String getMutter () { return mutter; }

}
