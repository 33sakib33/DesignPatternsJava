public class HBOMaxSubscriber extends Subscriber {

    public HBOMaxSubscriber(StreamingService subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void getStatus() {
        System.out.println( "HBOMax : " + ( subject.getBill() +35) );
    }
}