package PatternsJavaDemo.State.state;

public class FirstState implements TState {

    @Override
    public void action() {
        System.out.println("Cannon goes boom");
    }
}
