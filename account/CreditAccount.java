package account;

public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0 && balance + amount <= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && (balance - amount) >= -creditLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
