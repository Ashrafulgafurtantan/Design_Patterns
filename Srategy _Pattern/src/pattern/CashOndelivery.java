package pattern;

public class CashOndelivery implements Payment {
    @Override
    public void pay() {
        System.out.println("Cash on Delivery");
    }
}
