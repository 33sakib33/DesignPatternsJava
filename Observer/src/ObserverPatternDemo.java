public class ObserverPatternDemo {
    public static void main(String[] args) {
        StreamingService platform = new StreamingService();
        new HBOMaxSubscriber(platform);
        new NetflixSubscriber(platform);
        new DisneyPlusSubscriber(platform);

        System.out.println("Your Due Bill");
        platform.setBill(100);
    }
}