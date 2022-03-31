public class NetflixSubscriber extends Subscriber {

    public NetflixSubscriber(StreamingService subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void getStatus() {
        System.out.println( "Netflix : " + ( subject.getBill() +20) );
    }
}