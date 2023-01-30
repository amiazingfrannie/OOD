package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {

    private static final int DOLLAR = 100;
    private static final int CENTS = 88;

    private Amount testAmount;

    @BeforeEach
    void setUp() throws InvalidAmountError {
        testAmount = new Amount(DOLLAR, CENTS);
    }

    @Test
    void testValidDollar(){
        int DOLLAR = -10;
        assertThrows(InvalidAmountError.class, () -> new Amount(DOLLAR, CENTS));
    }

    @Test
    void testValidCents(){
        int CENTS = -10;
        assertThrows(InvalidAmountError.class, () -> new Amount(DOLLAR, CENTS));
    }

    @Test
    void testValidCents2(){
        int CENTS = 1000;
        assertThrows(InvalidAmountError.class, () -> new Amount(DOLLAR, CENTS));
    }
    @Test
    void testGetAmount() {
        double EXPECTED_AMOUNT = 100.88;
        assertEquals(EXPECTED_AMOUNT, testAmount.getAmount());
    }

    @Test
    void testGetDollar() {
        int EXPECTED_DOLLAR = 100;
        assertEquals(EXPECTED_DOLLAR, testAmount.getDollar());
    }

    @Test
    void testGetCents() {
        int EXPECTED_CENTS = 88;
        assertEquals(EXPECTED_CENTS, testAmount.getCents());
    }
}