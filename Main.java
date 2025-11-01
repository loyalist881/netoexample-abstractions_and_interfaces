import account.Account;
import account.CreditAccount;
import account.SimpleAccount;
import logger.Logger;
import logger.SimpleLogger;
import logger.SmartLogger;

public class Main {
    public static void main(String[] args) {
        Account account = new CreditAccount(0, 5000);
        Account account1 = new SimpleAccount(100000);

        account.pay(200);
        account1.pay(1000);
        account.transfer(account1, 500);
        account1.add(300);
        account1.add(1000);

        System.out.println("Simple: " + account.getBalance());
        System.out.println("Credit: " + account1.getBalance());
        System.out.println();

        Logger logger = new SimpleLogger();
        logger.log("Application started");
        logger.log("Something happened");
        logger.log("Critical ERROR occurred!");
        logger.log("error detected in module");
        System.out.println();

        Logger logger1 = new SmartLogger();
        logger1.log("Application started");
        logger1.log("Something happened");
        logger1.log("Critical ERROR occurred!");
        logger1.log("error detected in module");
    }
}