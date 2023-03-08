package model;
import java.io.Serializable;

public class Users implements Serializable{
	private String name;
	
	public Users( ) {}
	
	public Users(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
}

