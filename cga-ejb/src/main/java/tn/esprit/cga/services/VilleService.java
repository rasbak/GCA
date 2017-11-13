package tn.esprit.cga.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.cga.entity.Ville;

@Stateless
@LocalBean
public class VilleService {
@PersistenceContext 
 EntityManager em ;

public List<Ville> getAllVille() {
	// TODO Auto-generated method stub
	List<Ville> villes = null ;
	TypedQuery<Ville> query = em.createQuery("Select i from Ville i", Ville.class);
	villes = query.getResultList();
	System.out.println("aaaaaa"+villes.size());
	return villes;
}
}
