package org.grmcosta.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionMessage {

  protected Integer code;

  protected String title;

  protected String details;

  public ExceptionMessage(Integer code, String title, String details) {
    this.code = code;
    this.title = title;
    this.details = details;
  }
}


