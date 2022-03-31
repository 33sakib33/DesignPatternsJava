import java.util.ArrayList;
import java.util.List;

public class StreamingService {

    private List<Subscriber> subscribers = new ArrayList<>();
    private int bill;

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
        notifySubscribersOfDueBill();
    }

    public void subscribe(Subscriber sub1){
        subscribers.add(sub1);
    }

    public void notifySubscribersOfDueBill(){
        for (Subscriber sub : subscribers) {
            sub.getStatus();
        }
    }
}