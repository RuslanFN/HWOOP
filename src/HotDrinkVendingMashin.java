import java.util.List;

public class HotDrinkVendingMashin implements VendingMashin{
    private List<Product> productList;


    @Override
    public void initProduct(List<Product> products) {
        productList = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product drink : productList) {
            if (drink.getName().equals(name))
                return drink;
        }
        return null;
    }

    public Product getProduct(String name, double cost) {
        for (Product drink : productList) {
            if (drink.getName().equals(name) && drink.getCost() == cost)
                return drink;
        }
        return null;
    }


    public Product getProduct(String name, double cost, int temperature) {
        for (Product drink : productList) {
            HotDrik d = (HotDrik) drink;

            if (drink.getName().equals(name) && drink.getCost() == cost && d.getTemperature() == temperature)
                return drink;
        }
        return null;
    }
}
