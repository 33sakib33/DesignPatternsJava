public class driver {
    public static void main(String[] args) {
        Singleton obj= Singleton.getUniqueInstance();
        obj.oneInstanceBehave();
        obj= Singleton.getUniqueInstance();
        obj.oneInstanceBehave();
        obj.oneInstanceBehave();
        obj.oneInstanceBehave();

    }
}
