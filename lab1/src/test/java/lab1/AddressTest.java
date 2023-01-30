package lab1;

import lab1.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    private Address testAddress;
    private static final String EXPECTED_ADDRESS = "xx rd";

    @BeforeEach
    void setUp() {
        testAddress = new Address("xx rd");
    }

    @Test
    void getAddress() {
        assertEquals(EXPECTED_ADDRESS, testAddress.getAddress());
    }
}