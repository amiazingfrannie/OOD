package problem3;

public class Amount {

    /**
     * Amount class: to define an amount object, takes 2 params, int dollar and cents
     */
    protected int dollar;
    protected int cents;
    private static final double RATE = 0.01;

    /**
     * Constructor: validate dollar and cents via a private helper function
     * if validated, store the info
     * @param dollar
     * @param cents
     * otherwise:
     * @throws InvalidAmountError
     */
    public Amount(int dollar, int cents) throws InvalidAmountError {
        if(this.validDollar(dollar))
            this.dollar = dollar;
        else throw new InvalidAmountError("Invalid Dollar Input");
        if(this.validCents(cents))
            this.cents = cents;
        else throw new InvalidAmountError("Invalid Cents Input");
    }

    /**
     * a private helper function to identify if input is valid
     * @param dollar
     * @return boolean type, true or false
     */
    private boolean validDollar(int dollar){
        return (dollar >= 0);
    }
    private boolean validCents(int cents){
        return (cents >= 0 && cents <= 99);
    }

    /**
     * method to get the amount
     * @return a double type
     */
    public double getAmount(){
        return this.dollar + this.cents*RATE;
    }

    /**
     * method to get dollar part
     * @return int
     */
    public int getDollar(){
        return this.dollar;
    }

    /**
     * method to get the cents part
     * @return int
     */
    public int getCents(){
        return this.cents;
    }


}
