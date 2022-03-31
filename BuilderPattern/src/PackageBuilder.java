public class PackageBuilder {

    public OfferPackage makeWorkStationPackage(){
        OfferPackage meal = new OfferPackage();
        meal.addItem(new WorkstationDesktop());
        meal.addItem(new WorkstationLaptop());
        return meal;
    }

    public OfferPackage makeGamingPackage(){
        OfferPackage meal = new OfferPackage();
        meal.addItem(new GamingDesktop());
        meal.addItem(new GamingLaptop());
        return meal;
    }
}