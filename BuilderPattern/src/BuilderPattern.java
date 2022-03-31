public class BuilderPattern {
    public static void main(String[] args) {

        PackageBuilder obj = new PackageBuilder();

        OfferPackage vegMeal = obj.makeWorkStationPackage();
        System.out.println("Memo for Workstation Package");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        OfferPackage nonVegMeal = obj.makeGamingPackage();
        System.out.println("\n\nMemo for Gaming Package");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}