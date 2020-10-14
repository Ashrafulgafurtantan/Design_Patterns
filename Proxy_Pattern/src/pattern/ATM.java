package pattern;

public class ATM implements Proxy{
    CentralBank cb;
    public ATM(){
        cb= new CentralBank();
    }
    @Override
    public void checkBalance() {

        System.out.println("Your balance = "+cb.getMoney());
    }

    @Override
    public void withdrawMoney(double m) {

        if(m<cb.getMoney()){
          double  rest = cb.getMoney()-m;

            cb.setMoney(rest);
            System.out.println("Transaction Complete!!!");
        }else {
            System.out.println("Sorry!!! Not enough money");
        }
    }


}
