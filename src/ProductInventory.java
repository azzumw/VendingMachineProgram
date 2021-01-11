import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//cannot be subclassed
public final class ProductInventory {

    //cannot create instance
    private ProductInventory() {}

    private static ArrayList<Product> productArrayList = new ArrayList<Product>(Arrays.asList(
            new Product("Bounty",1.0,3),
            new Product("Walkers",0.4,0),
            new Product("Honey",5.45,10)
    ));


    public static ArrayList<Product> getProductInventory(){
        return productArrayList;
    }

    public static void addProduct(Product p){
        productArrayList.add(p);
    }

    public static void removeProduct(int i){
        productArrayList.remove(i);
    }
}
