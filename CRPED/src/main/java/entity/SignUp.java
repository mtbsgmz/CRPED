package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table
public class SignUp implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "URS_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "USR_SEQ")
	@GeneratedValue(generator = "USR_SEQ", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String compName;
	private String aEmail;
	private String aPass;
	private String uEmail;
	private String uPass;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
