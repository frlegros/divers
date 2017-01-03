package resteasy.resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class ExampleApplication extends Application{

    private Set<Object> singletons = new HashSet<Object>();

    public ExampleApplication() {
        singletons.add(new HelloWorldService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
