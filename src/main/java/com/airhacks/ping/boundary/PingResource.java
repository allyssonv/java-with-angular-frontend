package com.airhacks.ping.boundary;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;


/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {
	
	List<Person> items = new ArrayList<>();

    @GET
    public Response ping() {
    	
    	items.add(new Person("Mary Poppins", 26));
    	items.add(new Person("John Doe", 45));
    	items.add(new Person("Jessica Alba", 29));
    	items.add(new Person("Joe Higashi", 25));
    	items.add(new Person("Terry Bogard", 37));
    	
    	String json = new Gson().toJson(items);
    	
        return Response.ok(json).build();
    }

}
