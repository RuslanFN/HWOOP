public class HotDrik extends Product{
    private int temperature;

    @Override
    public String toString() {
        return "Product:" +
                " name = " + super.getName() +
                "; cost = " + super.getCost() +
                "; temperature = " + temperature + ";";
    }

    protected HotDrik(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
