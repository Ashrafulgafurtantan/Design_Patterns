package pattern;

public class Subscriber implements Observer {

   private String name;
   public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void  update(String chanelName){
        System.out.println("Hello "+name+" , "+chanelName +" uploaded a video!!!");
    }
}
