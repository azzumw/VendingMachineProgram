import java.util.ArrayList;
import java.util.Scanner;

class Menu{

    private ArrayList<Option> optionArrayList;
    private Scanner in;

    Menu(){
        this.optionArrayList = new ArrayList<>();

        //fill the menu with options for main menu
        optionArrayList.add(new Item("Show Products"));
        optionArrayList.add(new Item("Add a new Product"));
        optionArrayList.add(new Item("Restock Products"));
        optionArrayList.add(new Item("Exit"));


        in = new Scanner(System.in);

        int option = displayMenu();
        processMenuOption(option);
    }

    private void setMenuOptions(ArrayList<? extends Option> options){
        clear();
        optionArrayList.addAll(options);

    }

    private void clear(){
        if(!optionArrayList.isEmpty())
            optionArrayList.clear();
    }

    private int displayMenu(){
        int input;
        do {
            for(int i=0; i <optionArrayList.size(); i++){
                int choice = i + 1;
                System.out.println(choice +") "+ optionArrayList.get(i).getOptionString());
            }

            System.out.print("Enter option: ");
            input = in.nextInt();
        }while (input<1 || input > optionArrayList.size());
        this.clear();
        return input;
    }

    private void processMenuOption(int optionEntered){
        VendingMachine vm = new VendingMachine();
        //only focusing on case 1 for now until code clean
        switch (optionEntered){

            case 1: System.out.println("Current Products Available");

                setMenuOptions(vm.getProducts());
                int optionSelected = displayMenu();
                vm.purchaseProduct(vm.getProducts().get(optionSelected-1),in);
                break;

            case 2: vm.addProduct(new Product("Dummy",4.00,1));

                System.out.println(ProductInventory.getProductInventory().get(ProductInventory.getProductInventory().size()-1).getName());break;

            case 3:
            case 4: System.exit(0);

            default:System.out.println("default");
        }
    }
}
