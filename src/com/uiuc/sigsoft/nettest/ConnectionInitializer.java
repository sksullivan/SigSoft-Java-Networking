package com.uiuc.sigsoft.nettest;

public class ConnectionInitializer {

    //Main entry point for the application
    public static void main(String[] args) {
        Connection testConnection = new Connection("http://thin.npr.org");
        testConnection.get();
        System.out.println(testConnection.responseBody);
    }
}
