package org.authentication;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  protected ClientCertificateAuthenticationHandler(AuthenticationHandler nextHandler) {
    super(nextHandler);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("certificate")){
      System.out.println("I handle Client Certificate Auth");
    } else {
      super.handleRequest(requestType);
    }
  }

}
