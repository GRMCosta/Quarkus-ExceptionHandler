package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class UsernameException extends RuntimeException {

  protected Integer statusCode;
  protected ExceptionMessage exceptionMessage;

  public UsernameException(Integer statusCode, String title, String message) {
    super(message);
    this.statusCode = statusCode;
    this.exceptionMessage = new ExceptionMessage(statusCode, title, message);
  }

}
