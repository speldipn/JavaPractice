/**
 * @author Oh, Joon young
 * @since 2018-01-24
 **/
public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
        }
        balance -= money;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(100);
        System.out.println("통장 잔고: " + acc.getBalance());
        try {
            acc.withdraw(110);
        } catch (BalanceInsufficientException e) {
//            System.out.println("getMessage(): " + e.getMessage());
            e.printStackTrace();
        }
    }
}
