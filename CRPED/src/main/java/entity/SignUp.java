package entity;

import java.io.Serializable;

public class SignUp implements Serializable{

	private static final long serialVersionUID = 1L;

	private String compName;
	private String upImage;
	private String admin;
	private String aPass;
	private String aPassV;
	private String user;
	private String uPass;
	private String uPassV;
	
	
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getUpImage() {
		return upImage;
	}
	public void setUpImage(String upImage) {
		this.upImage = upImage;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getaPass() {
		return aPass;
	}
	public void setaPass(String aPass) {
		this.aPass = aPass;
	}
	public String getaPassV() {
		return aPassV;
	}
	public void setaPassV(String aPassV) {
		this.aPassV = aPassV;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuPassV() {
		return uPassV;
	}
	public void setuPassV(String uPassV) {
		this.uPassV = uPassV;
	}
	
	
	
}
