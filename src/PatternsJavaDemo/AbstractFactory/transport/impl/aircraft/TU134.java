package PatternsJavaDemo.AbstractFactory.transport.impl.aircraft;

import PatternsJavaDemo.AbstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU-134 is flying");
    }
}
