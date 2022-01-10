package org.grmcosta.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.grmcosta.exception.CustomException;
import org.grmcosta.exception.UsernameException;

@Slf4j
@Provider
public class CustomExceptionHandler implements ExceptionMapper<CustomException> {

  @Override
  public Response toResponse(CustomException e) {
    log.error("CustomException Handler", e);
    return Response.status(e.getStatusCode()).entity(e.getExceptionMessage()).build();
  }
}
