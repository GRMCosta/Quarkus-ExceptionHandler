package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

  protected Integer statusCode;
  protected ExceptionMessage exceptionMessage;

  public CustomException(Integer statusCode, String title, String message) {
    super(message);
    this.statusCode = statusCode;
    this.exceptionMessage = new ExceptionMessage(statusCode, title, message);
  }

}
