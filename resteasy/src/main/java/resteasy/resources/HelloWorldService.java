package resteasy.resources;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/HelloWorld")
public class HelloWorldService extends Application{


    public static final String HELLO_WORLD = "Hello World!";
    public static final String BYE_WORLD = "Bye World!";

    @GET
    @Path("/sayHello")
    @Produces(TEXT_PLAIN)
    public String sayHello()
    {
        return HELLO_WORLD;
    }

    @POST
    @Produces(TEXT_PLAIN)
    public String orderResource() {

        return BYE_WORLD;

    }
}
