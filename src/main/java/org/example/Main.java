package org.example;

public class Main {
    public static void main(String[] args) {
        Token token = new Token();
        token.createJwt();
        token.parse();
    }
}