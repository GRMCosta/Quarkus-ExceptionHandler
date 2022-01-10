package org.grmcosta.client;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.grmcosta.data.UserResponse;
import org.grmcosta.exception.RestClientMapper;

@RegisterRestClient
@RegisterProvider(RestClientMapper.class)
public interface MockyClient {

  @POST
  @Path("/446989ef-481c-475d-ac44-4f3a3fa36504")
  UserResponse login();

  @POST
  @Path("/12157905-a18c-4a97-8f3c-f0412b4f709d")
  Response loginError();

}
