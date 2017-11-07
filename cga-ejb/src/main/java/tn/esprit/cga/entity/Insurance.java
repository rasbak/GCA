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

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(mappedBy="insurance")
	private InsuranceAgent insuranceAgent;
	
	@OneToMany(mappedBy="insurance")
	private List<Policy> policies;

	
	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	public InsuranceAgent getInsuranceAgent() {
		return insuranceAgent;
	}

	public void setInsuranceAgent(InsuranceAgent insuranceAgent) {
		this.insuranceAgent = insuranceAgent;
	}
   
	
}
