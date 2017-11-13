package tn.esprit.cga.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Insurance
 *
 */
@Entity

public class Insurance implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    @Column
	private String nom;
    @Column
	private String email;
    @Column
	private int telephone ;
    @Column
	private String adresse;
	
	
	@OneToOne
	private User insuranceAgent;
	
	@OneToMany(mappedBy="insurance")
	private List<Policy> policies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public User getInsuranceAgent() {
		return insuranceAgent;
	}

	public void setInsuranceAgent(User insuranceAgent) {
		this.insuranceAgent = insuranceAgent;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	
	
	
}
