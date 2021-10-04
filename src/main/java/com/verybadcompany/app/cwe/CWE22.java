package com.verybadcompany.app.cwe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * CWE-22 Improper Limitation of a Pathname to a Restricted Directory ('Path Traversal')
 */
public class CWE22 implements CWEExample {

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
