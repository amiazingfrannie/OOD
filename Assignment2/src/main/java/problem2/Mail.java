package problem2;

import java.util.Objects;

/**
 * class Mail, to store the recipient's info
 * and the width, height and depth of a specific mail
 */
public class Mail {

  protected int width;
  protected int height;
  protected int depth;
  protected Recipient recipient;

  /**
   * constructor, to initialize the class, with 4 params
   * one is a recipient object
   * including the validation of the width, height and depth of a mail
   * @param width int
   * @param height int
   * @param depth int
   * @param recipient Recipient object
   * @throws InvalidMailException if width or height or depth is invalid, throw an exception
   */
  public Mail(int width, int height, int depth, Recipient recipient) throws InvalidMailException {
    if (validWidth(width))
      this.width = width;
    else throw new InvalidMailException("Invalid Width");
    if (validHeight(height))
      this.height = height;
    else throw new InvalidMailException("Invalid Height");
    if (validDepth(depth))
      this.depth = depth;
    else throw new InvalidMailException("Invalid Depth");
    this.recipient = recipient;
  }

  /**
   * private helper function, to validate the width
   * @param width int greater or equal to 1.5
   * @return true or false
   */
  private boolean validWidth(int width){ return width >= 1.5;}

  /**
   * private helper function, to validate the height
   * @param height int greater or equal to 2
   * @return true or false
   */
  private boolean validHeight(int height){ return height >= 2;}

  /**
   * private helper function, to validate the depth
   * @param depth int greater or equal to 1.5
   * @return true or false
   */
  private boolean validDepth(int depth){ return depth >= 1;}


  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getDepth() {
    return depth;
  }

  public Recipient getRecipient() {
    return recipient;
  }

  @Override
  public String toString() {
    return "Mail{" +
        "width=" + width +
        ", height=" + height +
        ", depth=" + depth +
        ", recipient=" + recipient +
        '}';
  }
}
