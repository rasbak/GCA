package tn.esprit.cga.services;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.cga.entity.Insurance;
import tn.esprit.cga.entity.InsuranceAgent;
import tn.esprit.cga.interfaces.InsuranceServiceInterface;




@Stateless
@LocalBean
public class InsuranceService implements InsuranceServiceInterface {
	@PersistenceContext
     EntityManager em ;
	
	@Override
	public void ajouterInsurance(Insurance insurance,int idAgent) {
		// TODO Auto-generated method stub
		InsuranceAgent ag= em.find(InsuranceAgent.class,idAgent);
        insurance.setInsuranceAgent(ag);
		em.persist(insurance);
		insurance.getId();
	}

	@Override
	public void deleteInsurance(int id) {
		// TODO Auto-generated method stub
		Insurance ins= em.find(Insurance.class, id);
		System.out.println("insurance :"+ins);
		em.remove(ins);
		
	}
	public void modifierInsurance(Insurance ins){
		em.merge(ins);
	}
	
	

	public List<Insurance> getAllInsurance() {
		// TODO Auto-generated method stub
		List<Insurance> insurances = null ;
		TypedQuery<Insurance> query = em.createQuery("Select i from Insurance i", Insurance.class);
		insurances = query.getResultList();
		System.out.println("aaaaaa"+insurances.size());
		return insurances;
	}
	
	
	public Insurance InssuranceByid(int id)
	{

		  Insurance ins = null;
			System.out.println("assurance"+ins);
		TypedQuery<Insurance> query=em.createQuery("Select i from Insurance i where i.insuranceAgent.id=:emp",Insurance.class);
		query.setParameter("emp", id);
      
        ins=query.getSingleResult();
		
		System.out.println("assurance"+ins);
		return ins;

	}

}
