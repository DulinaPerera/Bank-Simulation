import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private int PIN;
    private String currency;
    private String branch;
    private double balance;
    private ArrayList<Loan> loans;

    public Account() {

    }

    public Account(String currency, String branch, double balance) {
        this.accountNumber = generateAccountNumber();
        this.accountNumber = generatePIN();
        this.currency = currency;
        this.branch = branch;
        this.balance = balance;
    }

    private int generateAccountNumber() {
        return 0;
    }

    private int generatePIN() {
        return 0;
    }

    public int getPIN() {
        return PIN;
    }

    public void requestLoan() {

    }
}
