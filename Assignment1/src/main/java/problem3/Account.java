package problem3;

public class Account{

    /**
     * Account class: keeps username, year of opening account, country of account, an Amount type
     * all info are immutable
     * every method needs to generate a new Account type
     * 1. Immutable -- keyword final, unchangeable; no setter
     * 2. @deposit @withdraw return a new Account object
     */

    private final Amount amount;
    private final String userName;
    private final int year;
    private final String country;
    private Amount newBalance;
    private static final double CONVERSION = 0.000025;

    /**
     * Constructor: to initiate an Account object, takes 4 params
     * @param userName a string
     * @param year an int
     * @param country a string
     * @param amount an Amount type, represents the balance in the account
     */
    public Account(String userName, int year, String country, Amount amount) {
        this.amount = amount;
        this.userName = userName;
        this.year = year;
        this.country = country;
    }

    /**
     * method deposit: to deposit a certain amount to the account
     * 1. need to validate the amount via a private helper function
     *      if there's a carry, the dollar part +1
     * @param amount1 the amount to deposit
     * @return a new Account object with new balance
     * 2. if the amount is not valid
     * @throws InvalidAmountError
     */
    public Account deposit(Amount amount1) throws InvalidAmountError{
        if(validCarry(amount, amount1))
            newBalance = new Amount(amount.getDollar()+amount1.getDollar()+1,
                    amount.getCents()+amount1.getCents()-100);
        else newBalance = new Amount(amount.getDollar() + amount1.getDollar(),
                amount.getCents() + amount1.getCents());
        return new Account(userName, year, country, newBalance);
    }

    /**
     * method to get a double type of the balance
     * @return the balance
     */
    public double getBalance() {
        return this.amount.getAmount();
    }

    /**
     * a private helper function to identify if there'll be a carry when add the deposit to current balance
     * @param amount1 an Amount object
     * @param amount2 an Amount object
     * @return a boolean type
     */
    private boolean validCarry(Amount amount1, Amount amount2){
        return (amount1.getCents() + amount2.getCents() >= 100);
    }

    /**
     * method withdraw: to take a certain amount out of the current balance
     * 1. need to validate if there's enough money in acount via a helper function
     * if not, throw an error
     * @param amount1 an Amount object, represents the money taken out
     * @return a new Account object
     * @throws InvalidAmountError
     */
    public Account withdraw(Amount amount1) throws InvalidAmountError {
        if (amount1.getAmount() > amount.getAmount())
            throw new InvalidAmountError("Insufficient Balance");
        else {
            if(validReminder(amount, amount1))
                newBalance = new Amount(amount.getDollar() - amount1.getDollar(),
                        amount.getCents() - amount1.getCents());
            else newBalance = new Amount(amount.getDollar() - amount1.getDollar() - 1,
                    100 + amount.getCents() - amount1.getCents());
            return new Account(userName, year, country, newBalance);
        }
    }

    /**
     * a private helper function, to identify if the cent part of current balance is greater than
     * the amount about to take out
     * if not, return false
     * @param amount1 an Amount object, represents current balance
     * @param amount2 represents the amount about to take out
     * @return a boolean type
     */
    private boolean validReminder(Amount amount1, Amount amount2){
        return (amount1.getCents() - amount2.getCents() > 0);
    }

    /**
     * method to convert us dollar to bitcoins
     * @param amount1 an Amount object
     * @return a double
     */
    public double convert(Amount amount1){
        return amount1.getAmount()*CONVERSION;
    }

    /**
     * method to get username
     * @return
     */
    public String getUserName(){
        return this.userName;
    }

    /**
     * method to get country
     * @return
     */
    public String getCountry(){
        return this.country;
    }

    /**
     * method to get year
     * @return
     */
    public int getYear(){
        return this.year;
    }

}
