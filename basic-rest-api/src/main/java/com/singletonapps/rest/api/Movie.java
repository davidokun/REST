package com.singletonapps.rest.api;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by David Cuellar on 15/09/2015.
 */
@Path("/movies")
public class Movie {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getMovies(){
        return Json.createObjectBuilder().add("name","Terminator 2").build();
    }
}
