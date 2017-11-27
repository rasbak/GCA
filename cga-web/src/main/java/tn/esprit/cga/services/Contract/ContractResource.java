package tn.esprit.cga.services.Contract;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.cga.entity.Contract;
import tn.esprit.cga.services.ContractService;

@Path("contract")
@RequestScoped
public class ContractResource {
	@EJB
	ContractService contractservice;
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMyContract(@PathParam(value = "id")String id ){
		int idi=Integer.parseInt(id);
		return Response.ok(contractservice.getMyContract(idi)).build();
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWaiting(){
		
		return Response.ok(contractservice.getAllContract()).build();
		
	}
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchContract(@PathParam(value = "id") String id) {
		int id1 = Integer.parseInt(id);
			
		for (Contract c : contractservice.getAllContractAccepted()) {

			if (c.getId() == id1) {

				return Response.ok(200).entity(c).build();
			}
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContract(@QueryParam("insured_id")int insured_id,Contract contract)
	{
		contractservice.addContract(contract);
		contractservice.affecterContratAUser(contract.getId(), insured_id);
		return Response.status(Status.OK).entity("Add with success").build();
				
	}

}
