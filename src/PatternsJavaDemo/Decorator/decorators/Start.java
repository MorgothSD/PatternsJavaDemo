package PatternsJavaDemo.Decorator.decorators;

import PatternsJavaDemo.Decorator.object.Component;
import PatternsJavaDemo.Decorator.object.Window;

public class Start {

    public static void main(String[] args) {

        Component windowWithBorderAndColor = new BorderDecorator(new ColorDecorator(new Window()));
        windowWithBorderAndColor.draw();

    }

}
