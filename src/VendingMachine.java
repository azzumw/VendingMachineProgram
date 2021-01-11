import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private Menu menu;
    private ArrayList<Option> options;
    private Scanner in;


    public VendingMachine() {
        in = new Scanner(System.in);
//        int optionSelectedFromMain = menu.displayMenu();
//        processOptionFromMainMenu(optionSelectedFromMain);
    }

    //add a product
    public void addProduct(Product product){
        ProductInventory.addProduct(product);
    }

    public ArrayList<Product> showProducts(){
        return ProductInventory.getProductInventory();
    }

    private void removeProduct(int i){
        ProductInventory.removeProduct(i);
    }

    public void purchaseProduct(Product p){
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


//    private void processOptionFromMainMenu(int optionEntered){
//
//        //only focusing on case 1 for now until architectural improvement.
//        switch (optionEntered){
//
//            case 1: System.out.println("Current Products Available");
//                options.clear();
//                options.addAll(showProducts());
//                menu.setMenuOptions(options);
//                int optionSelected = menu.displayMenu();
//                Product product = showProducts().get(optionSelected-1);
//                purchaseProduct(product);
//
//                break;
//
//            case 2: addProduct(new Product("Dummy",4.00,1));
//
//                System.out.println(ProductInventory.getProductInventory().get(ProductInventory.getProductInventory().size()-1).getName());break;
//
//            case 3:
//            case 4: System.exit(0);
//
//            default:System.out.println("default");
//        }
//    }

}
