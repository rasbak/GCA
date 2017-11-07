package tn.esprit.cga.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Claim
 *
 */
@Entity

public class Claim implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Date accidentDate;
	private String accidentHour;
	private String localisation;
	private boolean injured;
	private boolean vehiclesDamage;
	private boolean otherObjectDamage;
	private String  namesAddressesPhonesWitnesses;

	@OneToOne
	private ClaimSimFields claimSimilerFields1;
	@OneToOne
	private ClaimSimFields claimSimilerFields2;
	@OneToOne
	private Statement statement;

	private String sketchOfTheAccident;
	
	@ManyToOne
	private Insured insured;

	
	
	public Insured getInsured() {
		return insured;
	}

	public void setInsured(Insured insured) {
		this.insured = insured;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAccidentDate() {
		return accidentDate;
	}

	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getAccidentHour() {
		return accidentHour;
	}

	public void setAccidentHour(String accidentHour) {
		this.accidentHour = accidentHour;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public boolean isInjured() {
		return injured;
	}

	public void setInjured(boolean injured) {
		this.injured = injured;
	}

	public boolean isVehiclesDamage() {
		return vehiclesDamage;
	}

	public void setVehiclesDamage(boolean vehiclesDamage) {
		this.vehiclesDamage = vehiclesDamage;
	}

	public boolean isOtherObjectDamage() {
		return otherObjectDamage;
	}

	public void setOtherObjectDamage(boolean otherObjectDamage) {
		this.otherObjectDamage = otherObjectDamage;
	}

	public String getNamesAddressesPhonesWitnesses() {
		return namesAddressesPhonesWitnesses;
	}

	public void setNamesAddressesPhonesWitnesses(String namesAddressesPhonesWitnesses) {
		this.namesAddressesPhonesWitnesses = namesAddressesPhonesWitnesses;
	}



	public ClaimSimFields getClaimSimilerFields1() {
		return claimSimilerFields1;
	}

	public void setClaimSimilerFields1(ClaimSimFields claimSimilerFields1) {
		this.claimSimilerFields1 = claimSimilerFields1;
	}

	public ClaimSimFields getClaimSimilerFields2() {
		return claimSimilerFields2;
	}

	public void setClaimSimilerFields2(ClaimSimFields claimSimilerFields2) {
		this.claimSimilerFields2 = claimSimilerFields2;
	}

	public Statement getStatelent() {
		return statement;
	}

	public void setStatelent(Statement statelent) {
		this.statement = statelent;
	}

	public String getSketchOfTheAccident() {
		return sketchOfTheAccident;
	}

	public void setSketchOfTheAccident(String sketchOfTheAccident) {
		this.sketchOfTheAccident = sketchOfTheAccident;
	}
	
	
   
}
