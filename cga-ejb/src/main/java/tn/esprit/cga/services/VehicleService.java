package tn.esprit.cga.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tn.esprit.cga.entity.Insured;
import tn.esprit.cga.entity.User;
import tn.esprit.cga.entity.Vehicle;
import tn.esprit.cga.entity.VehiclesATTT;
import tn.esprit.cga.interfaces.VehicleInterface;

//import org.primefaces.showcase.domain.Theme;
@Stateless
@LocalBean
public class VehicleService implements VehicleInterface 
{
	

	@PersistenceContext(unitName="cga-ejb")
	EntityManager em;
	
	@Override
	public int AddVehicle(Vehicle v) {
		em.merge(v);
		return v.getId();
		
	}

	@Override
	public List<Vehicle> getVehicleJPQL() {
		TypedQuery<Vehicle>query=em.createQuery("select v from Vehicle v",Vehicle.class);
		List<Vehicle>vehic=query.getResultList();
		Vehicle v=null;
		return vehic;
	}

	@Override
	public void deleteVehicleById(Integer vehicleID) {
		Query query= em.createQuery("Delete from Vehicle v where v.id=:vehicleID and ");
		query.setParameter("vehicleID", vehicleID);
		query.executeUpdate();
		System.out.println("vehicle deleted succesfully !!!");
		
	}

	@Override
	public void updateVehicle(Vehicle v) {
		em.merge(v);
		
	}

	@Override
	public List<Vehicle> getVehicleByIdAssure(int insured_id) {
		Insured i =em.find(Insured.class, insured_id);
			TypedQuery<Vehicle> query = em.createQuery("Select v from Vehicle v where v.insured=:insured", Vehicle.class);
			List<Vehicle> vehic=query.setParameter("insured", i).getResultList();
			return vehic;
		}
	@Override
	public VehiclesATTT CompareChassisVehicle(String numchassis){
		
		TypedQuery<VehiclesATTT> query = em.createQuery("Select v from VehiclesATTT v where v.numchassis="+numchassis, VehiclesATTT.class);
		VehiclesATTT vattt=query.getSingleResult();
		return vattt;
		
	}
	
	
}

