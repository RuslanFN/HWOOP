import java.util.List;

public interface VendingMashin {

    public void initProduct(List<Product> products);

    public Product getProduct(String name);

}
