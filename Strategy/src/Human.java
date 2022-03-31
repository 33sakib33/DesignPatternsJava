public class Human {
    private GreetingBehaviour behaviour;

    public void performGreeting() {
        if (behaviour != null) {
            behaviour.quack();
        }
    }

    public void setBehavior(GreetingBehaviour behavior) {
        this.behaviour = behavior;
    }
}
