package problem2;

import java.util.Objects;

/**
 * class Recipient, to store a person's first name, last name and email address
 */
public class Recipient{

  protected String firstName;
  protected String lastName;
  protected String emailAddr;

  /**
   * to initialize the Recipient class
   * @param firstName a string
   * @param lastName a string
   * @param emailAddr a string
   */
  public Recipient(String firstName, String lastName, String emailAddr){
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddr = emailAddr;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmailAddr() {
    return emailAddr;
  }

  @Override
  public String toString() {
    return "Recipient{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", emailAddr='" + emailAddr + '\'' +
        '}';
  }
}
