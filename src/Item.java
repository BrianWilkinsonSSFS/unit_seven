public class Item {
    private String number = "";
    private String description = "";
    private double price;
    Item (String one, String two, double three) {
        number = one;
        description = two;
        price = three;
        if(price < 0){
            price = 0;
        }
    }
    public double getTotalPrice(int num){
        if(num <= 0)
            num = 0;
        return price;
    }

    public String toString(){
        return "Item: "+ number + "\nPrice: "+ price + "\nDescription: " + description;
    }
}