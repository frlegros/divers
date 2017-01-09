package resteasy.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private static final Logger LOG = LoggerFactory.getLogger((HelloWorldService.class));

    public static final String HELLO_WORLD = "Hello World!";
    public static final String BYE_WORLD = "Bye World!";

    @GET
    @Produces(TEXT_PLAIN)
    public String sayHello()
    {
        LOG.debug("sayHello : {}", HELLO_WORLD);
        return HELLO_WORLD;
    }

    @POST
    @Produces(TEXT_PLAIN)
    public String orderResource() {

        return BYE_WORLD;

    }
}
