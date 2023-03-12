package model;
import java.io.Serializable;

public class Login implements Serializable {
	private boolean canLogin;
	
	public Login () {}
	
	public Login (boolean canLogin) {
		this.canLogin = canLogin;
	}
	
	public void setCanLogin(boolean canLogin) { this.canLogin = canLogin; }
}
