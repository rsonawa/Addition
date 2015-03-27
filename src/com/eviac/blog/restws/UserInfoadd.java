 
package com.eviac.blog.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("UserInfoService")

public class UserInfoadd {
	
	@GET
	@Path("/test/{i}/{j}/{k}")
	@Produces(MediaType.TEXT_PLAIN)
	public String add(@PathParam("i") int i, @PathParam("j") int j, @PathParam("k") int k) throws JSONException {
//		JSONObject obj = new JSONObject();
//		obj.put("FirstNum", "hello");
		String a = "hello";
		return a;
	}


@GET
@Path("/addition/{i}/{j}")
@Produces(MediaType.TEXT_PLAIN)
public String add(@PathParam("i") int i, @PathParam("j") int j) throws JSONException {

	JSONObject obj = new JSONObject();
	int firstnum = i;
	int secondnum = j;
	int sum =0;
	try{
	obj.put("FirstNum", firstnum);
    obj.put("SecondNum", secondnum);
    
if(i%2 == 0 && j%2 == 0)
{
	obj.put("Error", "You entered both even numbers, so no addition");
}
else if(i%2 != 0 && j%2 != 0)
{
	obj.put("Error", "You entered both odd numbers, so no addition");

}
else
{
	sum = i+j;
	obj.put("Addition", "You entered proper numbers");
    obj.put("Sum", sum);
	
}

}catch(JSONException pe){
    System.out.println("Error: " + pe.getMessage());
    System.out.println(pe);
 }
	return obj.toString();


}
}