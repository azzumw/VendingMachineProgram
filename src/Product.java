public class Product implements Option{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    int getQuantity(){
        return quantity;
    }

    void setQuantity(int quantity){
        if(quantity>0){
            this.quantity = quantity;
        }else{
            System.out.println("Out of Stock!");
        }

    }

    String getName(){
        return this.name;
    }

    @Override
    public String getOptionString() {

        return this.name + " £" +getPrice() +" ("+ getQuantity()+")";
    }
}
