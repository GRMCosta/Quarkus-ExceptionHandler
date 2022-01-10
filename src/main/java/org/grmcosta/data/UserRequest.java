package org.grmcosta.data;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.grmcosta.Messages;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

  @NotBlank(message = Messages.DETAILS_USERNAME_IS_REQUIRED)
  private String userName;

}
