package pattern;

public class Main {
    public static void main(String[]argc){
        ShoppingCart shopping = new ShoppingCart(new Bkash());
        shopping.pay();
    }
}
