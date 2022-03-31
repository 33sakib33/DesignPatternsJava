public class Client {
    public static void main(String[] args) {
        Human human = new Human();
        human.setBehavior(new Hi());
        human.performGreeting();
        human.setBehavior(new Hello());
        human.performGreeting();
    }
}
