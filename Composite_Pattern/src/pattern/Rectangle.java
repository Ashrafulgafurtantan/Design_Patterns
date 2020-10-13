package pattern;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Composite {

    Rectangle(String name){
        super(name);
    }
    @Override
    public void buildShape() {
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
    }
}
