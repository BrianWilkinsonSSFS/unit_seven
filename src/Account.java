public class Account {

    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.acctNum = (int)(Math.random() * 999) + 1;
    }

    public Account(Account acct) {
        this(acct.first, acct.last, acct.balance);
    }

    public Account() {
        this("", "", 0.0);
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdrawal(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Customer Name: " + this.first + " " +this.last +"\nAccount #: " + this.acctNum + "\nCurrent Balance: $" +
                this.balance;
    }
}
