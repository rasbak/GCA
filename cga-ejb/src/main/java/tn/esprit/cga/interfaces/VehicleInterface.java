package tn.esprit.cga.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.cga.entity.Insured;
import tn.esprit.cga.entity.Vehicle;
import tn.esprit.cga.entity.VehiclesATTT;

@Remote

public interface VehicleInterface {
	public int AddVehicle(Vehicle vehicle  );
	public List<Vehicle>getVehicleJPQL();
	void deleteVehicleById(Integer vehicleID);
	public void updateVehicle(Vehicle v);
	public List<Vehicle> getVehicleByIdAssure(int insured_id );
	public VehiclesATTT CompareChassisVehicle(String numchassis);
	
	
}
