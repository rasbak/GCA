package tn.esprit.cga.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicle
 *
 */
@Entity

public class Vehicle implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numchassis;
	private String marque;
	private String model;
	private String couleur;
	private String nbchevaux;
	private String immatriculation;
	
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

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getNbchevaux() {
		return nbchevaux;
	}

	public void setNbchevaux(String nbchevaux) {
		this.nbchevaux = nbchevaux;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	
   
}
