package problem1;

public class User {

    /**
     * User class: to store user's info, including firstname, lastname, phone number, email address and
     * credentials(a pair of username and password)
     */
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private Credentials credentials;

    /**
     * Constructor: takes 5 params
     * @param firstName a string
     * @param lastName a string
     * @param phoneNum a string
     * @param email a string
     * @param credentials a Credential object
     */
    public User(String firstName, String lastName, String phoneNum, String email, Credentials credentials){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.credentials = credentials;
    }

    /**
     * method getUsername
     * @return username, a string
     */
    public String getUsername(){return credentials.getUsername();}

    /**
     * method getPassword
     * @return password, a string
     */
    public String getPassword(){return credentials.getPasswordHash();}

    /**
     * method setFirstname
     * @param firstName, no return
     */
    public void setFirstName(String firstName){this.firstName = firstName;}

    /**
     * method getFirstname
     * @return firstname, a string
     */
    public String getFirstName(){return this.firstName;}

    /**
     * method setLastname
     * @param lastName no return
     */
    public void setLastName(String lastName){this.lastName = lastName;}

    /**
     * method to get lastname
     * @return lastname
     */
    public String getLastName(){return this.lastName;}

    /**
     * method to validate the length of phone number
     * if the length = 10, store it
     * @param phoneNum
     * otherwise: throw an exception
     * @throws InvalidLength
     */
    public void setPhoneNum(String phoneNum) throws InvalidLength{
        if (phoneNum.length() == 10){
            this.phoneNum = phoneNum;
        }
        else throw new InvalidLength("Invalid phone number!");
    }

    /**
     * method to get phone number
     * @return a string
     */
    public String getPhoneNum(){return this.phoneNum;}

    /**
     * method to store email
     * @param email
     */
    public void setEmail(String email){this.email = email;}

    /**
     * method to get email
     * @return a string
     */
    public String getEmail(){return this.email;}


}
