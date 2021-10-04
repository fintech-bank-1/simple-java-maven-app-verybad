package com.verybadcompany.app.cwe.more;

import com.verybadcompany.app.cwe.CWEExample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Another instance of CWE-22
 */
public class CWE22More implements CWEExample {

    @GET
    @Path("/images/{image}")
    @Produces("images/*")
    public Response getImage(@javax.ws.rs.PathParam("image") String image) throws FileNotFoundException {
        File file = new File("resources/images/", image); //Weak point

        if (!file.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(new FileInputStream(file)).build();
    }

}
