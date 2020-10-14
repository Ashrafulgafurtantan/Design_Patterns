package pattern;

public class Main {

    public static void main(String[] args) {

        Proxy atm = new ATM();
        atm.checkBalance();
        atm.withdrawMoney(100);
        atm.checkBalance();

       
    }
}
