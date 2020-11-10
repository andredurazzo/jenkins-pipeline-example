package com.mycompany.app;


/**
 * Hello world!
 */
public class App
{

  public App() {}

    public static void main(String[] args) {
      System.out.println(new App().getMessage());
    }

    private String getMessage() {
      var text = " Java 11";
      final String message = "Hello World!";
      return message.concat(text);
    }

}
