package pattern;

public class Main {

    public static void main(String[] args) {
            Chanel c1 = new Chanel("Pewdepie");
            Chanel c2 =new Chanel("Geeksforgeeks");

            Subscriber s1 =new Subscriber("Ashraf");
            Subscriber s2 =new Subscriber("Sun");
            Subscriber s3 =new Subscriber("Ryan");

            c1.addSubscriber(s1);
            c1.addSubscriber(s2);
            c2.addSubscriber(s2);
            c2.addSubscriber(s3);


            c1.uploadVideo();

    }
}
