package org.grmcosta.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.grmcosta.exception.RestClientException;

@Slf4j
@Provider
public class RestClientExceptionHandler implements ExceptionMapper<RestClientException> {

  @Override
  public Response toResponse(RestClientException e) {
    log.error("RestClientException Handler", e);
    return Response.status(e.getStatusCode()).entity(e.getExceptionMessage()).build();
  }
}
