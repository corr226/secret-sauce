package test.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;


@Path("/ftoc")
public class FtoC {
	@GET
	@Produces("application/jason")
	public Response convertftoc() throws JSONException {
		
		JSONObject json = new JSONObject();
		double f = 98.4;
		double c; 
		c = (f-32) * 5/9;
		
		json.put("F", f);
		json.put("C", c);
		
		String result = "@Produces(\"application/json\") Output:  \n\n F to C conversion: \n\n " + json; 
		return javax.ws.rs.core.Response.status(200).entity(result).build();
	}

	@Path("{f}")
	@GET
	@Produces("application/jason")
	public Response convertftocinput( @PathParam("f") float f) throws JSONException {
		
		JSONObject json = new JSONObject();
		float c; 
		c = (f-32) * 5/9;
		
		json.put("F", f);
		json.put("C", c);
		
		String result = "@Produces(\"application/json\") Output:  \n\n F to C conversion: \n\n " + json; 
		return javax.ws.rs.core.Response.status(200).entity(result).build();
	}	

}
