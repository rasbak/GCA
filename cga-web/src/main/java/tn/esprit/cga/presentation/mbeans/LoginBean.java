package tn.esprit.cga.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.cga.entity.User;
import tn.esprit.cga.services.AdministratorServiceLocal;

@ManagedBean
@SessionScoped
public class LoginBean {

	private String email;
	private String password;
	private User user;
	private boolean loggedIn;
	

	public String getEmail() {

		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	@EJB
	AdministratorServiceLocal administratorServiceLocal ;

	
	public String doLogin()
	{
		String navigateTo="null";
		user = administratorServiceLocal.getUserByEmailAndPassword(email,password);
		if(user != null )
		{
			if(user.getRole().equals("Expert")){
			navigateTo = "/Home?faces-redirect=true";
			}
			else if (user.getRole().equals("Admin")) {
				navigateTo = "/index?faces-redirect=true";	
			}else if (user.getRole().equals("Insured")) {
				navigateTo = "/Home?faces-redirect=true";
			}
			
			loggedIn =true;
		}
		else
		{
			FacesContext.getCurrentInstance().addMessage("form:btn",new FacesMessage(" bad credentials"));
		}
		return navigateTo;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String doLogout()
	{
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "pages-login?faces-redirect=true";
	}
	
	



}
