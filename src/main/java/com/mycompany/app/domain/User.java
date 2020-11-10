package com.mycompany.app.domain;

import java.time.Instant;

public class User {

  private String name;
  private String surname;
  private Instant birthDate;

  public User() {
  }

  public User(final String name, final String surname, final Instant birthDate) {
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public User setName(final String name) {
    this.name = name;
    return this;
  }

  public String getSurname() {
    return surname;
  }

  public User setSurname(final String surname) {
    this.surname = surname;
    return this;
  }

  public Instant getBirthDate() {
    return birthDate;
  }

  public User setBirthDate(final Instant birthDate) {
    this.birthDate = birthDate;
    return this;
  }
}
