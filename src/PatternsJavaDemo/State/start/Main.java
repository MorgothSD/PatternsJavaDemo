package PatternsJavaDemo.State.start;

import PatternsJavaDemo.State.context.TContext;
import PatternsJavaDemo.State.state.FirstState;
import PatternsJavaDemo.State.state.MoveState;
import PatternsJavaDemo.State.state.TState;

public class Main {

    public static void main(String[] args) {

        TContext context = new TContext();
        TState stateMove = new MoveState();
        TState stateFirst = new FirstState();

        context.setState(stateFirst);
        context.action();

        context.setState(stateMove);
        context.action();
    }
}
