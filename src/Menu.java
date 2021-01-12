import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    private ArrayList<Option> optionArrayList;
    private Scanner in;

    Menu(){
        this.optionArrayList = new ArrayList<>();


        optionArrayList.add(new Item("Show Products"));
        optionArrayList.add(new Item("Add a new Product"));
        optionArrayList.add(new Item("Restock Products"));
        optionArrayList.add(new Item("Exit"));

        in = new Scanner(System.in);

        int option = displayMenu();
        processOptionFromMainMenu(option);
    }


    void setMenuOptions(ArrayList<Option> options){
        this.optionArrayList = options;
    }

    void clear(){
        if(!optionArrayList.isEmpty())
            optionArrayList.clear();
    }

    int getOptionsSize(){
        return this.optionArrayList.size();
    }


    int displayMenu(){
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

    private void processOptionFromMainMenu(int optionEntered){
        VendingMachine vm = new VendingMachine();
        //only focusing on case 1 for now until code clean
        switch (optionEntered){

            case 1: System.out.println("Current Products Available");

                clear();
                optionArrayList.addAll(vm.getProducts());
                this.setMenuOptions(optionArrayList);
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
