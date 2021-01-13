import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    public VendingMachine() {
//        in = new Scanner(System.in);
//        int optionSelectedFromMain = menu.displayMenu();
//        processOptionFromMainMenu(optionSelectedFromMain);
    }

    //add a product
    public void addProduct(Product product){
        ProductInventory.addProduct(product);
    }

    public ArrayList<Product> getProducts(){
        return ProductInventory.getProductInventory();
    }

    private void removeProduct(int i){
        ProductInventory.removeProduct(i);
    }

    /**Have not implemented it yet*/
    public void purchaseProduct(Product p, Scanner in){
        //this method implementation is not complete yet.
        if(p.getQuantity()>0){
            //purchase the product
            System.out.print("Pay: £" +p.getPrice());
            System.out.print("\nEnter Amount:");
            double amountPaid = in.nextDouble();

            System.out.println(amountPaid);
            p.setQuantity(p.getQuantity()-1);
        }else{
            System.out.println("Product is out of stock!");
        }
    }

}
