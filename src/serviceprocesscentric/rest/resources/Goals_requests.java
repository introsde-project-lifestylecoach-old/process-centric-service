package serviceprocesscentric.rest.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/goals")
public class Goals_requests {

}
