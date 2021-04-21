package PatternsJavaDemo.Decorator.decorators;

import PatternsJavaDemo.Decorator.object.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added border");
    }
}
