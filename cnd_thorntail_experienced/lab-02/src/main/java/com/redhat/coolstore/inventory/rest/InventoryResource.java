package com.redhat.coolstore.inventory.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.inject.Inject;
import com.redhat.coolstore.inventory.service.InventoryService;
import com.redhat.coolstore.inventory.model.Inventory;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Objects;

@Path("/inventory")
@ApplicationScoped
public class InventoryResource {
	@Inject
	 private InventoryService inventoryService;
	//@Inject
	// private Inventory inventory;
	
	@GET
	   @Path("/{itemId}")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Inventory getInventory(@PathParam("itemId") String itemId) {

	       // get the inventory object from the inventoryService. Use the given itemId.
	       // if the inventory object that you retrieved is null then
	       // throw a NotFoundException
	       // else return the inventory object

		 //try {
	
				 Inventory inventory= inventoryService.getInventory(itemId);
				
				 if (Objects.isNull(inventory)) {
				      throw new NotFoundException("inventory " + " does not exist.");
				 }	
				 else {
				 return inventory;
				 }
		       
		   // } catch (NotFoundException e) {
		    //	System.out.println("Something went wrong." + e);
		    //}
		 
	}
  
}
