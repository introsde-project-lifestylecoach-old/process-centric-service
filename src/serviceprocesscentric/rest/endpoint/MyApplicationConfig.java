package serviceprocesscentric.rest.endpoint;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("process-centric-service")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("serviceprocesscentric.rest.endpoint");
    }
}
