package tn.esprit.cga.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tn.esprit.cga.entity.Insurance;
import tn.esprit.cga.entity.InsuranceAgent;

import tn.esprit.cga.entity.User;
import tn.esprit.cga.interfaces.AdministratorService;

@Stateless
@LocalBean
public class AdministratorServiceLocal implements AdministratorService {
	@PersistenceContext
	private EntityManager em;

	@Override
	public int ajouterUser(User u) {
		em.persist(u);
		return u.getId();
	}

	@Override
	public List<User> getUserByRole(String role) {

		System.out.println("Role ser" + role);
		TypedQuery<User> query = em.createQuery("Select u from User u " + "where u.role=:role", User.class);
		query.setParameter("role", role);

		List<User> users = null;
		try {
			users = query.getResultList();
		} catch (NoResultException e) {
			// Logger.info("aucun utilisateur trouve avec role : " + role);
			System.out.println("acces refus");
		}
		System.out.println(users);

		return users;

	}

	@Override
	public List<User> findAll() {
		List<User> query = em.createQuery("Select u from User u ", User.class).getResultList();
		return query;
	}

	@Override
	public void deleteUserById(int idUser) {
		User user = em.find(User.class, idUser);

		em.remove(user);

	}

	@Override
	public void updateUser(User user) {
		em.merge(user);

	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		TypedQuery<User> query = em.createQuery(
				"Select u from User u " + "where u.email=:email and " + "u.password=:password", User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		User user = null;
		try {
			user = query.getSingleResult();
		} catch (NoResultException e) {
			// Logger.info("aucun utilisateur trouve avec email : " + email);
			System.out.println("acces refus");
		}

		return user;
	}

	@Override
	public List<InsuranceAgent> getPoliciesByInsured(User user) {
		TypedQuery<InsuranceAgent> query = em.createQuery(
				"Select u from InsuranceAgent u ", InsuranceAgent.class);
	
		List<InsuranceAgent> users = null;
		try {
			users = query.getResultList();
			System.out.println("Liste cree");
			
		} catch (NoResultException e) {
			System.out.println("acces refus");
		}
		return users;
	}

	@Override
	public List<Insurance> getInsuranceByInsured(User user) {
		Query query = em.createQuery("Select u from Insurance u where u.insured=:insured ", Insurance.class);
		query.setParameter("insured", user);
		
	    		return query.getResultList();
	}

	

}
