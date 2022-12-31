import CheckOut.CheckOut;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CheckOutTest {

    CheckOut checkOut = new CheckOut(0.075);

    @Test
    void addPurchaseItemTest() {
        String firstItem = "Shower Head";
        ArrayList<String> item = new ArrayList<>();
        item.add(firstItem);
        CheckOut.addItem(firstItem);
        assertEquals(item, CheckOut.checkOutItemList());
        // Add another Item
        String secondItem = "Gear Box";
        item.add(secondItem);
        CheckOut.addItem(secondItem);
        assertEquals(item, CheckOut.checkOutItemList());
        assertEquals("Gear Box", item.get(1));
    }

    @Test
    void addPurchaseUnitPrice(){
        double itemPrice = 1_500;
        ArrayList<Double> price = new ArrayList<>();
        price.add(itemPrice);
        CheckOut.addItemPrice(itemPrice);
        assertEquals(price, CheckOut.checkPriceList());
        assertEquals(1500, price.get(0));
    }

    @Test
    void addItemQuantityTest(){
        int quantityPurchased = 6;
        ArrayList<Integer> quantity = new ArrayList<>();
        quantity.add(quantityPurchased);
        CheckOut.addItemQuantity(quantityPurchased);
        assertEquals(quantity, CheckOut.checkOutQuantity());
    }

    @Test
    void removePurchaseItem(){
        String input = "Gear Box";
        double inputPrice = 250;
        int inputQuantity = 6;
        ArrayList<String> item = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        item.add(input);
        price.add(inputPrice);
        quantity.add(inputQuantity);
        CheckOut.addItem(input);
        CheckOut.addItemPrice(inputPrice);
        CheckOut.addItemQuantity(inputQuantity);
        assertEquals(item, CheckOut.checkOutItemList());
        assertEquals(1, item.size());
        item.remove(input);
        CheckOut.removeItem(input);
        assertEquals(item, CheckOut.checkOutItemList());
        assertEquals(item, CheckOut.checkPriceList());
        assertEquals(item, CheckOut.checkOutQuantity());
    }

    @Test
    void itemAmountTest(){
        double itemPrice = 500;
        int itemQuantity = 5;
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        price.add(itemPrice);
        quantity.add(itemQuantity);
        CheckOut.addItemPrice(itemPrice);
        CheckOut.addItemQuantity(itemQuantity);
        assertEquals(2500,  CheckOut.itemAmount().get(0));
    }

    @Test
    void checkOutAmountTest(){
        double itemPrice = 450;
        int itemQuantity = 2;
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        price.add(itemPrice);
        quantity.add(itemQuantity);
        CheckOut.addItemPrice(itemPrice);
        CheckOut.addItemQuantity(itemQuantity);
        ArrayList<Double> itemAmount = CheckOut.itemAmount();
        assertEquals(967.5, CheckOut.checkOutAmount());
    }
}
