package com.mycompany.app.domain;

public class Product {
  private String name;

  public Product() {
  }

  public Product(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Product setName(final String name) {
    this.name = name;
    return this;
  }
}
