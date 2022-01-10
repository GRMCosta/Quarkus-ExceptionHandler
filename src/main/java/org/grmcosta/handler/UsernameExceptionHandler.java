package org.grmcosta.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.grmcosta.exception.UsernameException;

@Slf4j
@Provider
public class UsernameExceptionHandler implements ExceptionMapper<UsernameException> {

  @Override
  public Response toResponse(UsernameException e) {
    log.error("UsernameException Handler", e);
    return Response.status(e.getStatusCode()).entity(e.getExceptionMessage()).build();
  }
}
