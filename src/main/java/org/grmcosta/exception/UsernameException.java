package org.grmcosta.exception;

import lombok.Getter;

@Getter
public class UsernameException extends CustomException {

  public UsernameException(Integer statusCode, String title, String message) {
    super(statusCode, title, message);
  }
}
