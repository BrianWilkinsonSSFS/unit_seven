public class Item {

    private String number;
    private String description;
    private double price;

    public Item(String number, String description, double price) {
        this.number = number;
        this.description = description;
        if (price < 0)
            this.price = 0;
        else
            this.price = price;
    }

    public double getTotalPrice(int quantity) {
        if (quantity < 0)
            return 0;
        else
            return quantity * this.price;
    }

    public String toString() {
        return "Item: " + this.number + "\nPrice: $" + this.price + "\nDescription: " + this.description;
    }


}
