package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {

    private Credentials testCredentials;
    private static final String EXP_USERNAME = "Jane Doe";
    private static final String EXP_PASSWORD = "jane123456";

    @BeforeEach
    void setUp() {
        testCredentials = new Credentials(EXP_USERNAME, EXP_PASSWORD);
    }

    @Test
    void getUsername() {
        assertEquals(EXP_USERNAME, testCredentials.getUsername());
    }

    @Test
    void setUsername() {
        testCredentials.setUsername("Jane Doe");
        assertEquals(EXP_USERNAME, testCredentials.getUsername());
    }

    @Test
    void getPasswordHash() {
        assertEquals(EXP_PASSWORD, testCredentials.getPasswordHash());
    }

    @Test
    void setPasswordHash() {
        testCredentials.setPasswordHash("jane123456");
        assertEquals(EXP_PASSWORD, testCredentials.getPasswordHash());
    }
}