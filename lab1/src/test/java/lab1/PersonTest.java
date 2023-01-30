package lab1;

import lab1.Address;
import lab1.Email;
import lab1.Name;
import lab1.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person testPerson;
    private Name testName;
    private Email testEmail;
    private Address testAddress;
    private static final String EXPECTED_NAME = "John";
    private static final String EXPECTED_EMAIL = "john@neu.edu";
    private static final String EXPECTED_ADDRESS = "1988 NE 30ST ST";

    @BeforeEach
    void setUp() {
        testName = new Name("John");
        testEmail = new Email("john@neu.edu");
        testAddress = new Address("1988 NE 30ST ST");
        testPerson = new Person(testName, testEmail, testAddress);
    }

    @Test
    void getName() {
        assertEquals(EXPECTED_NAME, testPerson.getName());
    }

    @Test
    void getEmail() {
        assertEquals(EXPECTED_EMAIL, testPerson.getEmail());
    }

    @Test
    void getAddress() {
        assertEquals(EXPECTED_ADDRESS, testPerson.getAddress());
    }
}