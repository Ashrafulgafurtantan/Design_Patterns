package pattern;

public class Bkash implements Payment {
    @Override
    public void pay() {
        System.out.println("pay in BKash");
    }
}
