import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton uniqueInstance;
    int d=0;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public void oneInstanceBehave(){
        System.out.println("This is your one instance");
        d++;
        System.out.println(d);
    }
}