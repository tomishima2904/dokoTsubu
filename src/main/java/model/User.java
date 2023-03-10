package model;
import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private int pass;
	

	public User( ) {}
	
	public User(String name, int pass) {
		this.name = name;
		this.pass = 1234;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPass() { return pass; }
	public void setPass(int pass) { this.pass = pass; }
	
}
