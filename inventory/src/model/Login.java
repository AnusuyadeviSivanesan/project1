package model;

public class Login {
	private int ID;
	private String Username;
	private String passsword;
	private long Mobilenumber;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public long getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	
	
}
