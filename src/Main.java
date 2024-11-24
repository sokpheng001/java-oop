import model.Account;
import model.CreditCardAccount;

public class Main {
    public static void main(String[] koko) {
        Account creditCardAccount = new CreditCardAccount();
        creditCardAccount.deposit(101.0);
        creditCardAccount.showBalance();
        creditCardAccount.withdraw(10.0);
        creditCardAccount.showBalance();
    }
}
