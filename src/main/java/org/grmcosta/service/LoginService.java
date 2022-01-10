package org.grmcosta.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.grmcosta.Messages;
import org.grmcosta.client.MockyClient;
import org.grmcosta.data.UserRequest;
import org.grmcosta.data.UserResponse;
import org.grmcosta.exception.UserNotActiveException;
import org.grmcosta.exception.UsernameException;

@Slf4j
@ApplicationScoped
public class LoginService {

  @Inject
  @RestClient
  private MockyClient mockyClient;

  public UserResponse login(UserRequest userRequest) {
    validateUsername(userRequest);
    var user = mockyClient.login();
    //userIsActive(user);
    return user;
  }

  private void validateUsername(UserRequest user) {
    if (!user.getUserName().equals("grmcosta")) {
        throw new UsernameException(HttpStatus.SC_UNPROCESSABLE_ENTITY,
          Messages.TITLE_UNPROCESSABLE_ENTITY, Messages.DETAILS_INVALID_USERNAME);
    }
  }

  private void userIsActive(UserResponse user) {
    if (!user.getIsActive()) {
      throw new UserNotActiveException(HttpStatus.SC_UNPROCESSABLE_ENTITY,
          Messages.TITLE_UNPROCESSABLE_ENTITY, Messages.DETAILS_USER_NOT_ACTIVE);
    }
  }

  public UserResponse errorRestClient(UserRequest userRequest) {
    return mockyClient.loginError().readEntity(UserResponse.class);
  }
}
