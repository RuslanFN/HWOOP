import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrinkVendingMashin HDVM = new HotDrinkVendingMashin();
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrik("coffee", 100, 70));
        productList.add(new HotDrik("capuchino", 120, 65));
        productList.add(new HotDrik("latte", 110, 75));
        productList.add(new HotDrik("ice latte", 140, 25));
        productList.add(new HotDrik("hot chocolate", 100, 74));
        HDVM.initProduct(productList);
        System.out.println(HDVM.getProduct("ice latte"));
        System.out.println(HDVM.getProduct("hot chocolate", 100));
        System.out.println(HDVM.getProduct("capuchino", 120, 65));
        System.out.println(HDVM.getProduct("###", 0, 0));
    }
}