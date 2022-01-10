package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class UserNotActiveException extends RuntimeException {

  protected Integer statusCode;
  protected ExceptionMessage exceptionMessage;

  public UserNotActiveException(Integer statusCode, String title, String message) {
    super(message);
    this.statusCode = statusCode;
    this.exceptionMessage = new ExceptionMessage(statusCode, title, message);
  }

}
