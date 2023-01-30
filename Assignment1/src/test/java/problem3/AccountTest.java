package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account testAccount;
    private Account newAccount;
    private static final String USERNAME= "Fran";
    private static final int YEAR = 2022;
    private static final String COUNTRY = "US";

    private Amount balance = new Amount(100, 20);
    private static final double RATE = 0.000025;
    AccountTest() throws InvalidAmountError {}

    @BeforeEach
    void setUp() {
        testAccount = new Account(USERNAME, YEAR, COUNTRY, balance);
    }

    @Test
    void depositNoCarry() throws InvalidAmountError {
        int DEPOSIT_DOLLAR = 100;
        int DEPOSIT_CENTS = 40;
        double DEPOSIT_AMOUNT = 200.60;
        Amount deposit = new Amount(DEPOSIT_DOLLAR, DEPOSIT_CENTS);
        newAccount = testAccount.deposit(deposit);
        assertEquals(DEPOSIT_AMOUNT, newAccount.getBalance());
    }

    @Test
    void depositWithCarry() throws InvalidAmountError {
        int DEPOSIT_DOLLAR = 100;
        int DEPOSIT_CENTS = 90;
        double BALANCE_AMOUNT = 201.10;
        Amount deposit = new Amount(DEPOSIT_DOLLAR, DEPOSIT_CENTS);
        newAccount = testAccount.deposit(deposit);
        assertEquals(BALANCE_AMOUNT, newAccount.getBalance());
    }
    @Test
    void withdrawNoRemain() throws InvalidAmountError {
        int WITHDRAW_DOLLAR = 10;
        int WITHDRAW_CENTS = 10;
        double BALANCE_AMOUNT = 90.10;
        Amount withdraw = new Amount(WITHDRAW_DOLLAR, WITHDRAW_CENTS);
        newAccount = testAccount.withdraw(withdraw);
        assertEquals(BALANCE_AMOUNT, newAccount.getBalance());
    }

    @Test
    void withdrawWithRemain() throws InvalidAmountError {
        int WITHDRAW_DOLLAR = 10;
        int WITHDRAW_CENTS = 30;
        double BALANCE_AMOUNT = 89.90;
        Amount withdraw = new Amount(WITHDRAW_DOLLAR, WITHDRAW_CENTS);
        newAccount = testAccount.withdraw(withdraw);
        assertEquals(BALANCE_AMOUNT, newAccount.getBalance());
    }

    @Test
    void withdrawInsufficientBalance() throws InvalidAmountError {
        int WITHDRAW_DOLLAR = 1000;
        int WITHDRAW_CENTS = 30;
        Amount withdraw = new Amount(WITHDRAW_DOLLAR, WITHDRAW_CENTS);
        assertThrows(InvalidAmountError.class, () -> testAccount.withdraw(withdraw));
    }

    @Test
    void convert() {
        double EXPECTED_BITCOINS = 100.20*RATE;
        assertEquals(EXPECTED_BITCOINS, testAccount.convert(balance));
    }

    @Test
    void getUserName() {
        String EXPECTED_USERNAME = "Fran";
        assertEquals(EXPECTED_USERNAME, testAccount.getUserName());
    }

    @Test
    void getCountry() {
        String EXPECTED_COUNTRY = "US";
        assertEquals(EXPECTED_COUNTRY, testAccount.getCountry());
    }

    @Test
    void getYear() {
        int EXPECTED_YEAR = 2022;
        assertEquals(EXPECTED_YEAR, testAccount.getYear());
    }
}