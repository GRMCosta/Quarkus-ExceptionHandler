package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class RestClientException extends RuntimeException {

  protected Integer statusCode;
  protected ExceptionMessage exceptionMessage;

  public RestClientException(Integer statusCode, ExceptionMessage message) {
    super(message.toString());
    this.statusCode = statusCode;
    this.exceptionMessage = message;
  }

}
