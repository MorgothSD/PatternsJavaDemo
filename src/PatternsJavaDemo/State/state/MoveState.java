package PatternsJavaDemo.State.state;

public class MoveState implements TState {

    @Override
    public void action() {
        System.out.println("Moving out...");
    }
}
