package training.oracle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("greeting")
public class GreetingResource {
	
	private static String message="Welcome to RESTAPI";
	
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getMessage() {
		return message;
	}
	
	@GET
	@Produces({MediaType.TEXT_HTML})
	public String getHtmlMessage() {
		return "<h1> " +message + " </h1>";
	}
	
	
	@GET
	public String getAnyMessage() {
		return message ;
	}
	
	@PUT
	public void setMessage(String givenMessage) {
		 this.message=givenMessage;
	}
	
}
