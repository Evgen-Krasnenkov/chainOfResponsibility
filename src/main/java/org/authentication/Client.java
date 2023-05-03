package org.authentication;

public class Client {

  public static void main(String[] args) {
    BasicAuthenticationHandler handler =
            new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));
    handler.handleRequest("certificate");
    handler.handleRequest("digest");
  }

}
