package pattern;

public class Faced {

   private String accNumber,password;

   CheckAccountNumber checkAccountNumber;
   CheckFund checkFund;
   CheckPassword checkPassword;
    public Faced(String accNumber,String password) {
        this.accNumber=accNumber;
        this.password= password;
        checkAccountNumber= new CheckAccountNumber();
        checkFund = new CheckFund();
        checkPassword = new CheckPassword();
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getPassword() {
        return password;
    }

    public  void withdraw(float money){
        if(checkPassword.isPasswordAccurate(getPassword()) && checkAccountNumber.isAccNumberAccurate(getAccNumber()) && checkFund.haveEnoughMoney(money)){
            checkFund.decreaseFund(money);
            System.out.println("Transaction Completed!!!\nYou have "+checkFund.getFund()+ " left in your account :)");

        }else{
            System.out.println("Sorry!!! You don't have enough money :( \nYou have "+checkFund.getFund()+ " left in your account :)");
        }

    }

    public  void deposit(float money){
        if(checkPassword.isPasswordAccurate(getPassword()) && checkAccountNumber.isAccNumberAccurate(getAccNumber()) ){
            checkFund.increaseFund(money);
            System.out.println("Transaction Completed!!!\nYou have "+checkFund.getFund()+ " in your account :)");

        }else{
            System.out.println("Error!!! Something wrong in your info :( \nYou have "+checkFund.getFund()+ " in your account :)");
        }
    }

}
