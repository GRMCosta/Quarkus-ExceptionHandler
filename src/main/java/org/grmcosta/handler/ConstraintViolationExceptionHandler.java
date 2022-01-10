package org.grmcosta.handler;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.grmcosta.Messages;
import org.grmcosta.exception.ExceptionMessage;

@Slf4j
@Provider
public class ConstraintViolationExceptionHandler implements ExceptionMapper<ConstraintViolationException> {

  @Override
  public Response toResponse(ConstraintViolationException e) {
    log.error("ConstraintViolationException Handler", e);
    return Response.status(HttpStatus.SC_PRECONDITION_FAILED)
        .entity(new ExceptionMessage(HttpStatus.SC_PRECONDITION_FAILED,
            Messages.TITLE_PRECONDITION_FAILED,
            e.getConstraintViolations().stream().findFirst().get().getMessage())).build();
  }
}
