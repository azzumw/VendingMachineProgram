public class Item implements Option{
    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getOptionString() {
        return itemName;
    }
}
