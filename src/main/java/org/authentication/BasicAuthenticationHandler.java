package org.authentication;

public class BasicAuthenticationHandler extends AuthenticationHandler {

  protected BasicAuthenticationHandler(AuthenticationHandler nextHandler) {
    super(nextHandler);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("basic")){
      System.out.println("I handle Basic Auth");
    } else {
      super.handleRequest(requestType);
    }
  }

}
