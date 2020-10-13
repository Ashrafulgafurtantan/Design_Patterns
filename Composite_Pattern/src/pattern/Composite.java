package pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class  Composite implements IShape {
    List<IShape> shapes = new ArrayList<>();
   String  name;

   Composite(String name){
        super();
       this.name = name;
   }

    abstract void buildShape();
    public void draw() {
        buildShape();
        System.out.println(name);
        for( IShape i:shapes){
            i.draw();
        }
    }
}
