import java.util.ArrayList;
import java.util.List;

public class OfferPackage {
    private List<Computer> cart = new ArrayList<Computer>();

    public void addItem(Computer item){
        cart.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Computer item : cart) {
            cost += item.retPrice();
        }
        return cost;
    }

    public void showItems(){

        for (Computer item : cart) {
            System.out.println("Item : " + item.retName());
            System.out.println(" Case : " + item.retCase().casing());
            System.out.println(" Price : " + item.retPrice());
            System.out.println("--------------------------------");
        }
    }
}