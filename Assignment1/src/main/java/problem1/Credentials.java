package problem1;

public class Credentials {

    /**
     * Credentials class is meant to store a String username
     * and a String password as a pair
     */

    private String username;
    private String passwordHash;

    /**
     * Constructor: includes 2 parameters
     * @param username String
     * @param passwordHash String
     */
    public Credentials(String username, String passwordHash){
        this.username = username;
        this.passwordHash = passwordHash;
    }

    /**
     * method getUsername, no param
     * @return username
     */
    public String getUsername(){
        return this.username;
    }

    /**
     * method setUsername
     * @param username a String
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * method getPasswordHash, no param
     * @return password, a string
     */
    public String getPasswordHash(){
        return this.passwordHash;
    }

    /**
     * method setPasswordHash
     * @param passwordHash a string
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
