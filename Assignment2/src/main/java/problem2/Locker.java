package problem2;

import java.util.Objects;

/**
 * class Locker, to store a locker's info
 * including a mail and the maximum width, height and depth of the locker
 */
public class Locker{

  private int maxWidth;
  private int maxHeight;
  private int maxDepth;
  private Mail mail;

  /**
   * constructor: takes 4 params, including validation of the maximum width height and depth
   * with initial mail object as null
   * @param maxWidth int
   * @param maxHeight int
   * @param maxDepth int
   * @param mail Mail (no need
   * @throws InvalidMailException if any of maximum width/height/depth is invalid
   * throw an exception
   */
  public Locker(int maxWidth, int maxHeight, int maxDepth, Mail mail) throws InvalidMailException {
    if (validMaxWidth(maxWidth))
      this.maxWidth = maxWidth;
    else throw new InvalidMailException("Invalid MaxWidth");
    if (validMaxHeight(maxHeight))
      this.maxHeight = maxHeight;
    else throw new InvalidMailException("Invalid MaxHeight");
    if (validMaxDepth(maxDepth))
      this.maxDepth = maxDepth;
    else throw new InvalidMailException("Invalid MaxDepth");
    this.mail = null;
  }

  /**
   * private helper function to validate the maxWidth
   * @param maxWidth int
   * @return true or false
   */
  private boolean validMaxWidth(int maxWidth){ return maxWidth >= 10;}

  /**
   * private helper function to validate the maxHeight
   * @param maxHeight int
   * @return true or false
   */
  private boolean validMaxHeight(int maxHeight){ return maxHeight >= 20;}

  /**
   * private helper function to validate the maxDepth
   * @param maxDepth int
   * @return true or false
   */
  private boolean validMaxDepth(int maxDepth){ return maxDepth >= 15;}


  /**
   * method to get the mail object in a locker
   * @return a mail
   */
  public Mail getMail(){ return this.mail;}

  /**
   * method to get the max width in a locker
   * @return an int
   */
  public int getMaxWidth() {
    return maxWidth;
  }
  /**
   * method to get the max height in a locker
   * @return an int
   */
  public int getMaxHeight() {
    return maxHeight;
  }
  /**
   * method to get the max depth in a locker
   * @return an int
   */
  public int getMaxDepth() {
    return maxDepth;
  }

  /**
   * method to put a mail into a locker
   * if the locker is not empty or the width/height/depth is greater than the maximum
   * throw an exception
   * @param mail Mail
   * @throws InvalidMailException send out message
   */
  public void addMail(Mail mail) throws InvalidMailException {
    if (this.initialMail() && this.validMail(mail)){
      this.mail = mail;
    }
    else throw new InvalidMailException("Not succeeded");
  }

  /**
   * private helper function to validate if the initial locker is empty
   * @return true or false
   */
  private boolean initialMail(){ return this.mail == null;}

  /**
   * private helper function, to validate if the mail is fitting the locker
   * @param mail Mail
   * @return true or false
   */
  private boolean validMail(Mail mail){
    return mail.width <= this.maxWidth
        && mail.height <= this.maxHeight
        && mail.depth <= this.maxDepth;
  }

  /**
   * method to pick up a mail from a locker
   * if the locker is not empty and the recipient on mail matches the params
   * remove the mail from locker and return it
   * @param recipient Recipient
   * @return a Mail object
   * @throws InvalidMailException if the locker is empty or the recipient is not right
   * throw an exception
   */
  public Mail pickupMail(Recipient recipient) throws InvalidMailException {
    if (!initialMail() && this.matchRecipient(recipient)){
      Mail pickedupMail = this.mail;
      this.mail = null;
      return pickedupMail;
    }
    else throw new InvalidMailException("Wrong pickup");
  }

  /**
   * private helper function, to verify if the recipient is matching the one on the mail
   * @param recipient Recipient
   * @return true or false
   */
  private boolean matchRecipient(Recipient recipient){ return this.mail.recipient == recipient;}

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Locker locker)) {
      return false;
    }
    return maxWidth == locker.maxWidth && maxHeight == locker.maxHeight
        && maxDepth == locker.maxDepth
        && Objects.equals(mail, locker.mail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWidth, maxHeight, maxDepth, mail);
  }
}
