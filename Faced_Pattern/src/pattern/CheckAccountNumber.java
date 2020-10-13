package pattern;

public class CheckAccountNumber {

    private  String accNumber = "123456";

    public String getAccNumber() {
        return accNumber;
    }

    public  boolean isAccNumberAccurate(String accNum){

        return accNum.equals(getAccNumber());

    }
}
