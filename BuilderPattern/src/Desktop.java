public abstract class Desktop implements Computer {

    @Override
    public Case retCase() {
        return new TemperedCase();
    }

    @Override
    public abstract float retPrice();
}