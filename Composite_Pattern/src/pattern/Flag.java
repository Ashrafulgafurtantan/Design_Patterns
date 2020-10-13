package pattern;

import java.util.ArrayList;
import java.util.List;

public class Flag extends Composite {

    Flag(String name) {
        super(name);
    }

    @Override
    public void buildShape() {
        shapes.add(new Circle());
        shapes.add(new Rectangle("Rectengle"));
    }
}
