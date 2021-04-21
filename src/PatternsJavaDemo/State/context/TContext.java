package PatternsJavaDemo.State.context;

import PatternsJavaDemo.State.state.TState;

public class TContext implements TState {

    private TState state;

    public TState getState() {
        return state;
    }

    public void setState(TState state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }
}
