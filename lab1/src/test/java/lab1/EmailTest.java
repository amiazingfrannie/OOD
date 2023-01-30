package lab1;

import lab1.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    private Email testEmail;
    private static final String EXPECTED_EMAIL = "Snow@neu.edu";

    @BeforeEach
    void setUp() {
        testEmail = new Email("Snow@neu.edu");
    }

    @Test
    void getEmail() {
        assertEquals(EXPECTED_EMAIL, testEmail.getEmail());
    }
}