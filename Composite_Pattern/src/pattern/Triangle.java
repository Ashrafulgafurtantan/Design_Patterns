package pattern;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Composite {
    Triangle(String name){
        super(name);
    }
    @Override
    public void buildShape() {
        shapes.add(new Line());
        shapes.add(new Line());
        shapes.add(new Line());
    }
}