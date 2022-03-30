package main.java;

public class Secretary {

  private final String first_name;
  private final String middle_name;

  public Secretary(String first_name, String middle_name) {
    this.first_name = first_name;
    this.middle_name = middle_name;
  }

  public String getFirst_name() {
    return this.first_name;
  }

  public String getMiddle_name() {
    return this.middle_name;
  }
}
