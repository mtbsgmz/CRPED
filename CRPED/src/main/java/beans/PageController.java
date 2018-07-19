package beans;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

import dao.LoginDAO;
import entity.SignUp;
import service.LoginService;
import service.ProjectService;

import java.io.Serializable;
import java.util.List;
 
@ManagedBean
@SessionScoped
public class PageController implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private String password;
	private LoginService loginService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void init() {
		loginService = new LoginService();
	}
	
	
	
	@Override
	public String toString() {
		return "PageController [username=" + username + ", password=" + password 
				+ "]";
	}
	
	public String checkUser() {
		System.out.println(toString());
		
		List<SignUp> kisi = loginService.KisileriGoster();//login service kisi listesini donduruyor
		
for (SignUp signUp : kisi) {
	System.out.println(signUp.getCompName());
}		
		
		
		return null;
		
	}
	

/*
	public void checkUser(ActionEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean loggedIn = false;

		if (username != null && username.equals("admin") && password != null && password.equals("123")) {
			loggedIn = true;
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
			
		} else {
			loggedIn = false;
			message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
		}

		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", loggedIn);
	}
	*/

	
	//validate login
	/*	public String checkUser() {
			boolean valid = LoginDAO.validate(user, pwd);
			if (valid) {
				HttpSession session = SessionUtils.getSession();
				session.setAttribute("username", user);
				return "admin";
			} else {
				FacesContext.getCurrentInstance().addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_WARN,
								"Incorrect Username and Passowrd",
								"Please enter correct username and Password"));
				return "login";
			}
		}

		//logout event, invalidate session
		public String logout() {
			HttpSession session = SessionUtils.getSession();
			session.invalidate();
			return "login";
		}
	}*/
	
	/*
	 * PRIMEFACES USER CHECK
	 *   public void login(ActionEvent event) {
        FacesMessage message = null;
        boolean loggedIn = false;
         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
    }   
	 */
	
	
	

	
	
	
	
	
}