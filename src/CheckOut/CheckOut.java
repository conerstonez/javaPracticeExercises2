package CheckOut;

import java.util.ArrayList;

public class CheckOut {
    private static final ArrayList<String> purchaseItem = new ArrayList<>();
    private static final ArrayList<Double> price = new ArrayList<>();
    private static final ArrayList<Integer> quantity = new ArrayList<>();
    private static final ArrayList<Double> amount = new ArrayList<>();
    private static double amountDue;
    private static double vat;

    public CheckOut(double vat){
        CheckOut.vat = vat/100;
    }

    public static void addItem(String item) {
        purchaseItem.add(item);
    }

    public static ArrayList<String> checkOutItemList() {
        return purchaseItem;
    }

    public static void addItemPrice(double itemPrice) {
        if(itemPrice > 0) {
            price.add(itemPrice);
        }
    }

    public static ArrayList<Double> checkPriceList() {
        return price;
    }

    public static void addItemQuantity(int quantityPurchased) {
        if(quantityPurchased > 0) {
            quantity.add(quantityPurchased);
        }
    }

    public static ArrayList<Integer> checkOutQuantity() {
        return quantity;
    }

    public static void removeItem(String item) {
        int index = purchaseItem.indexOf(item);
        purchaseItem.remove(index);
        price.remove(index);
        quantity.remove(index);
    }

    public static ArrayList<Double> itemAmount() {
        for(int index = 0; index < price.size(); index++) {
            double itemCost = price.get(index) * quantity.get(index);
            amount.add(index, itemCost);
        }
        return amount;
    }

    public static double checkOutAmount() {
        for (Double itemCost : amount) {
           amountDue += itemCost;
        }
        return amountDue + (amountDue * vat);
    }

    public static double getVat() {
        return amountDue * vat;
    }
}
