package resteasy.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/HelloWorld")
public class HelloWorldService extends Application{


    public static final String HELLO_WORLD = "Hello World!";

    @GET
    @Path("/sayHello")
    public String sayHello()
    {
        return HELLO_WORLD;
    }

}
