

public class BankAccount extends Thread  {
    boolean open = false;
    int balance;

    public int getBalance() throws BankAccountActionInvalidException {
        if (!open) throw new BankAccountActionInvalidException("Account closed");
        return balance;
    }

    synchronized  public void deposit(int money) throws BankAccountActionInvalidException {
        if (!open) throw new BankAccountActionInvalidException("Account closed");
        if (money < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        balance += money;
    }
    synchronized public void withdraw(int money) throws BankAccountActionInvalidException {
        if (!open) throw new BankAccountActionInvalidException("Account closed");
        if (money < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if (balance == 0) throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        if (balance - money < 0) throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        balance -= money;

    }

    private boolean isOpen() {
        return open;
    }
    public void open() {
        open = true;
    }
    public void close() {
        open = false;
    }
}