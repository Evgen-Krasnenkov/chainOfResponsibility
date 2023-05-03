package org.authentication;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  protected DigestAuthenticationHandler(AuthenticationHandler nextHandler) {
    super(nextHandler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("digest")){
      System.out.println("I handle Digest Auth");
    } else {
      super.handleRequest(requestType);
    }
  }

}
