package pattern;

public class CheckFund {

    private  double fund  =1000.00;

    public double getFund() {
        return fund;
    }

    public  void increaseFund(double m){
        fund+=m;
    }
    public void decreaseFund(double m){
        fund-=m;
    }

    public boolean haveEnoughMoney(double m){
        return m < getFund();
    }


}
