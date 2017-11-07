package tn.esprit.cga.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Insured
 *
 */
@Entity

public class Insured extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int driverLicenseNumber;
	private Date delivredIn;
	private String cin1;
	private String cin2;
	@OneToOne(mappedBy="insured")
	private Address address;
	
	@OneToMany(mappedBy="insured")
	private List<Report> reports;
	
	@OneToMany(mappedBy="insured")
	private List<Vehicle> vehicles;
	
	@OneToMany(mappedBy=("insured"))
	private List<Claim> claims;
	
	@OneToMany(mappedBy="insured")
    private List<Contract> contracts;


	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public int getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(int driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public Date getDelivredIn() {
		return delivredIn;
	}

	public void setDelivredIn(Date delivredIn) {
		this.delivredIn = delivredIn;
	}

	public String getCin1() {
		return cin1;
	}

	public void setCin1(String cin1) {
		this.cin1 = cin1;
	}

	public String getCin2() {
		return cin2;
	}

	public void setCin2(String cin2) {
		this.cin2 = cin2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
	
	
	
	
	
	
	
   
}
