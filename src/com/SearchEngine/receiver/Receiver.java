package com.SearchEngine.receiver;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.SearchEngine.driver.*;
import com.SearchEngine.main.Response;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class Receiver {

	@POST
	@Path("search")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces({MediaType.APPLICATION_JSON})
	public Response search(
			@HeaderParam("songName") String songName) {

		Engine searchEngine = Engine.getInstance();
		ArrayList<String> result = searchEngine.getSearchResults(songName);
		Response response = new Response();
		String[] urls = new String[result.size()];
		for(int i=0;i<result.size();i++){
			urls[i] = result.get(i);
		}
		response.setUrls(urls);
		return response;
	
	}

	
	
	
	
	
}
