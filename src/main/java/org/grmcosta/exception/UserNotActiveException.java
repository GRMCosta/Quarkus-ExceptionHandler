package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class UserNotActiveException extends CustomException {

  public UserNotActiveException(Integer statusCode, String title, String message) {
    super(statusCode, title, message);
  }
}
