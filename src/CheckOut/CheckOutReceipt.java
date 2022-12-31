package CheckOut;

import java.util.Scanner;

public class CheckOutReceipt {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        CheckOut checkOutReceipt = new CheckOut(7.5);

        System.out.println("'y' to add purchased item\n'r' to add remove item\n'n' to add quit");
        label:
        while(true) {
            System.out.print("> ");
            String cashierCommand = sc.next().toLowerCase();
            switch (cashierCommand) {
                case "y":
                    System.out.print("Item bought: ");
                    CheckOut.addItem(sc.next());
                    System.out.print("Price: ");
                    CheckOut.addItemPrice(sc.nextDouble());
                    System.out.print("Quantity purchased: ");
                    CheckOut.addItemQuantity(sc.nextInt());
                    break;
                case "r":
                    System.out.print("Item to be removed: ");
                    String item = sc.next();
                    CheckOut.removeItem(item);
                    break;
                default:
                    System.out.print("Invalid input!\n");
                    break;
                case "n":
                    break label;
            }
            System.out.print("\n'y' to add purchased item; 'r' to add remove item; 'n' to add quit\n");
        }
        if(CheckOut.checkOutItemList().size() == 0){
            System.out.print("No items bought");
        }
        else {
            System.out.printf("%10s%15s%18s%20s%n", "ITEM", "PRICE", "QUANTITY", "AMOUNT");
            for (int index = 0; index < CheckOut.checkOutItemList().size(); index++) {
                System.out.printf("%10s%15.2f%18d%20.2f%n", CheckOut.checkOutItemList().get(index),
                        CheckOut.checkPriceList().get(index), CheckOut.checkOutQuantity().get(index),
                        CheckOut.itemAmount().get(index));
            }
            System.out.printf("%n%23s%s%38.5f", "VAT @ ", "%", CheckOut.getVat());
//            System.out.printf("%n%25s%38.2f", "AMOUNT: ", );
            System.out.printf("%n%25s%38.2f", "AMOUNT DUE: ", CheckOut.checkOutAmount());
        }
    }
}
