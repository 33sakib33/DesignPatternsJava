public class DisneyPlusSubscriber extends Subscriber {

    public DisneyPlusSubscriber(StreamingService subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void getStatus() {
        System.out.println( "Disney Plus : " + ( subject.getBill() +40) );
    }
}