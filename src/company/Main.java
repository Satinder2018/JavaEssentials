package company;
import company.model.ClothingItem;
//import java.text.NumberFormat;

public class Main {
    public static void Main(String[] args){
        ClothingItem item = new ClothingItem();
        item.setType("Shirt");
        item.setSize("M");
        item.setPrice(20);
        item.setQuantity(2);

        var TotalPrice = item.getPrice() * item.getQuantity();
      // var formatter = Number.Format.getCurrencyInstance();
        var output = "Your " + item.getType() + "order will cost " + TotalPrice;

        System.out.println(output);

    }
}