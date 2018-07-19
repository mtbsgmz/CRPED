package beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entity.SignUp;
import service.SignUpService;

@ManagedBean
@RequestScoped
public class SignupBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String compName;
	private String aEmail;
	private String aPass;
	private String uEmail;
	private String uPass;
	private SignUpService signUpService;
	
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaPass() {
		return aPass;
	}
	public void setaPass(String aPass) {
		this.aPass = aPass;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	
	@PostConstruct
	public void init() {
		signUpService = new SignUpService();
	}
	@Override
	public String toString() {
		return "SignupBean [compName=" + compName + ", aEmail=" + aEmail + ", aPass=" + aPass + ", uEmail=" + uEmail
				+ ", uPass=" + uPass + ", signUpService=" + signUpService + "]";
	}
	
	public void Save() {
		SignUp signUp = new SignUp();
		signUp.setaEmail(getaEmail());
		signUp.setaPass(getaPass());
		signUp.setCompName(getCompName());
		signUp.setuEmail(getuEmail());
		signUp.setuPass(getuPass());
		System.out.println(toString());
		}
	
	
	
}
