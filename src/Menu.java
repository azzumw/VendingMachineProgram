import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    private ArrayList<Option> optionArrayList;
    private Scanner in;

    Menu(ArrayList<Option> options){
        this.optionArrayList = options;
        in = new Scanner(System.in);
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
}
