public abstract class Laptop implements Computer {

    @Override
    public Case retCase() {
        return new AcrylicCase();
    }

    @Override
    public abstract float retPrice();
}