package org.grmcosta.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

  private String userName;

  private String email;

  private String phone;

  private Boolean isActive;

  private String description;

}
