package org.authentication;

public abstract class AuthenticationHandler {
  private AuthenticationHandler nextHandler;

  protected AuthenticationHandler(AuthenticationHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handleRequest(String requestType) {
    if (nextHandler != null) {
      nextHandler.handleRequest(requestType);
    }
  }

}
