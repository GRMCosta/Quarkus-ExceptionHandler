package org.grmcosta.resource;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.grmcosta.data.UserRequest;
import org.grmcosta.service.LoginService;

@Path("/poc")
public class LoginResource {

  @Inject
  private LoginService loginService;

  @POST
  @Path("/login")
  @Produces(MediaType.APPLICATION_JSON)
  public Response login(@Valid UserRequest userRequest) {
    var login = loginService.login(userRequest);
    return Response.ok(login).build();
  }

  @POST
  @Path("/error")
  @Produces(MediaType.APPLICATION_JSON)
  public Response errorRestClient(@Valid UserRequest userRequest) {
    var login = loginService.errorRestClient(userRequest);
    return Response.ok(login).build();
  }
}