package pattern.facade;

/**
 * Created by Phil on 15/07/2014.
 */
public class FundsCheck {

    private double cashInAccount = 1000.00;
    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if (cashToWithdrawal > getCashInAccount()) {
            System.out.println("Eror : you don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Witdrawal complete : Current Balance is " + getCashInAccount());

            return true;
        }

    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current balance is " + getCashInAccount());
    }
}
