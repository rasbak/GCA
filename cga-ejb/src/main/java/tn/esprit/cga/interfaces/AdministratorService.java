package tn.esprit.cga.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.cga.entity.Insurance;
import tn.esprit.cga.entity.InsuranceAgent;

import tn.esprit.cga.entity.User;

@Remote
public interface AdministratorService {
	public int ajouterUser(User user);
	public List<User> getUserByRole(String role);
	public List<User> findAll();
	public void deleteUserById(int idUser);
	public void updateUser(User user);
	public User getUserByEmailAndPassword(String email, String password);
	public List<InsuranceAgent> getPoliciesByInsured(User user);
	
	public List<Insurance> getInsuranceByInsured(User user); 	
	

}
