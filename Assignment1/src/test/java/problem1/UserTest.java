package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testUser;
    private static final String EXP_USERNAME = "jane doe";
    private static final String EXP_PASSWORD = "jane123456";
    private static final String EXP_FIRSTNAME = "jane";
    private static final String EXP_LASTNAME = "doe";
    private static final String EXP_EMAIL = "jane@neu.edu";
    private static final String EXP_PHONENUM = "0012345678";

    @BeforeEach
    void setUp() {
        Credentials testCredentials = new Credentials("jane doe", "jane123456");
        testUser = new User("jane", "doe", "0012345678",
                "jane@neu.edu", testCredentials);
    }

    @Test
    void getUsername() {
        assertEquals(EXP_USERNAME, testUser.getUsername());
    }

    @Test
    void getPassword() {
        assertEquals(EXP_PASSWORD, testUser.getPassword());
    }

    @Test
    void setFirstName() {
        testUser.setFirstName("jane");
        assertEquals(EXP_FIRSTNAME, testUser.getFirstName());
    }

    @Test
    void getFirstName() {
        assertEquals(EXP_FIRSTNAME, testUser.getFirstName());
    }

    @Test
    void setLastName() {
        testUser.setLastName("doe");
        assertEquals(EXP_LASTNAME, testUser.getLastName());
    }

    @Test
    void getLastName() {
        assertEquals(EXP_LASTNAME, testUser.getLastName());
    }

    @Test
    void setPhoneNum() throws InvalidLength {
        testUser.setPhoneNum("0012345678");
        assertEquals(EXP_PHONENUM, testUser.getPhoneNum());
    }

    @Test
    void setPhoneNumError(){
        assertThrows(InvalidLength.class, () -> testUser.setPhoneNum("00123456780000"));
    }

    @Test
    void getPhoneNum() {
        assertEquals(EXP_PHONENUM, testUser.getPhoneNum());
    }

    @Test
    void setEmail() {
        testUser.setEmail("jane@neu.edu");
        assertEquals(EXP_EMAIL, testUser.getEmail());
    }

    @Test
    void getEmail() {
        assertEquals(EXP_EMAIL, testUser.getEmail());
    }


}