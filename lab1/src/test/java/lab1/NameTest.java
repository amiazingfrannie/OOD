package lab1;

import lab1.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    private Name testName;
    private static final String EXPECTED_NAME = "Snow";

    @BeforeEach
    void setUp() {
        testName = new Name("Snow");
    }

    @Test
    void getName() {
        assertEquals(EXPECTED_NAME, testName.getName());
    }
}