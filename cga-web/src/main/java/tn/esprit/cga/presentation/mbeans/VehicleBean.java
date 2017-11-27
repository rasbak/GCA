package tn.esprit.cga.presentation.mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.cga.entity.*;
import tn.esprit.cga.services.VehicleService;
@ManagedBean
@SessionScoped
public class VehicleBean {
	private String numchassis;
	private String marque;
	private String model;
	private String color;
	private int horsepower;
	private String immatriculation;
	private Type type;
	private Vehicle vehicle;
	private List<Vehicle>vehicles;
	//private VehiclesATTT vattt;
	private String numchassisAttt;
	private List<VehiclesATTT>vattt;
	private Integer VehicleIdUpdated;

	


	public Integer getVehicleIdUpdated() {
		return VehicleIdUpdated;
	}



	public void setVehicleIdUpdated(Integer vehicleIdUpdated) {
		VehicleIdUpdated = vehicleIdUpdated;
	}



	public List<VehiclesATTT> getVattt() {
		return vattt;
	}



	public void setVattt(List<VehiclesATTT> vattt) {
		this.vattt = vattt;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public String getNumchassisAttt() {
		return numchassisAttt;
	}

	public void setNumchassisAttt(String numchassisAttt) {
		this.numchassisAttt = numchassisAttt;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getNumchassis() {
		return numchassis;
	}

	public void setNumchassis(String numchassis) {
		this.numchassis = numchassis;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}



	@EJB
	VehicleService vehicleservice;
	
	public void addVehicle(){
//		VehiclesATTT l=vehicleservice.CompareChassisVehicle(vehicle.getNumchassis());
//		
//	System.out.println(l);	
	
//       if(l.getNumchassis().equals(vehicle.getNumchassis())){
//		if ((vehicle.getNumchassis())==immatriculation.CompareChassisVehicle(l)){
	vehicleservice.AddVehicle(new Vehicle(horsepower, numchassis, marque, model, color, horsepower, immatriculation, type));
		System.out.println("Vehicle added !!!");
//		else{System.out.println("no record found for this vehicle !!!");}
//	
	}
	public List<Vehicle> getVehicles(){
		vehicles=vehicleservice.getVehicleJPQL();
		return vehicles;
	}
	public List<Vehicle> getMyVehicleByInsuredId(){
		
	vehicles =	vehicleservice.getVehicleByIdAssure(2);
	return vehicles;
	}
	
	public void SupprimerVehicle(Integer vehicleID){
		vehicleservice.deleteVehicleById(vehicleID);
		
	}
	public void modifier(Vehicle vehicle){
		this.setMarque(vehicle.getMarque());
		this.setModel(vehicle.getModel());
		this.setColor(vehicle.getColor());
		this.setHorsepower(vehicle.getHorsepower());
		this.setNumchassis(vehicle.getNumchassis());
		this.setImmatriculation(vehicle.getImmatriculation());
		this.setVehicleIdUpdated(vehicle.getId());
		
		
	}
	public void mettreAjourVehicle(){
		vehicleservice.updateVehicle(new Vehicle(numchassis, marque, model, color, horsepower, immatriculation, type,VehicleIdUpdated)); 
	}
	public void ConfirmDelete(){
		addMessage("successfull", "Your vehicle has been deleted succesfully !!!");
		
	}
	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
