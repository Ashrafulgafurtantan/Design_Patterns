package pattern;

import java.util.ArrayList;
import java.util.List;

public class Chanel implements Subject {
    public String name;
    List<Subscriber> subscriberList=new ArrayList<>();
    Chanel(String name){
        this.name = name;

    }

    @Override
    public   void addSubscriber(Subscriber s){
        subscriberList.add(s);
    }

    @Override
    public   void deleteSubscriber(Subscriber s){
        subscriberList.remove(s);
    }

    private void notifySubscribers(){
        for(Subscriber sc: subscriberList){
            sc.update( name);
        }

    }

    @Override
    public void uploadVideo(){
        notifySubscribers();
    }


}
