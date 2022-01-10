package org.grmcosta.exception;

import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

public class RestClientMapper implements ResponseExceptionMapper<RuntimeException> {

  @Override
  public RuntimeException toThrowable(Response response) {
    return new RestClientException(response.getStatus(),response.readEntity(ExceptionMessage.class));
  }
}
