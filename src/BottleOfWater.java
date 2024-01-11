public class BottleOfWater extends Product{
    private double volume;
    protected BottleOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name = " + super.getName() +
                "cost = " + super.getCost() +
                "volume = " + volume;
    }
}
