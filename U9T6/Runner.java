package U9T6;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ShippingItem myItem = new ShippingItem(10);
        System.out.println(myItem.getWeight());
        System.out.println(myItem.getCost());

        ShippingItem insItem = new InsuredShippingItem(10, 50);
        System.out.println(insItem instanceof InsuredShippingItem);
        System.out.println(((InsuredShippingItem) insItem).getInsuredAmount());
        System.out.println(insItem.getWeight());

        ShippingItem newItem = new InsuredShippingItem(10, 50);
        System.out.println(newItem.getCost());

        ArrayList<ShippingItem> itemList = new ArrayList<>();
        itemList.add(new ShippingItem(10));
        itemList.add(new InsuredShippingItem(20, 50));
        itemList.add(new ShippingItem(30));
        itemList.add(new InsuredShippingItem(50, 70));
        /* MISSING CODE */
        // use a for loop to determine the total cost of all 4 items
        // in itemList; if the item is an InsuredShippingItem, add an
        // additional 30 dollars of insurance BEFORE adding its costs to
        // the total (use the addMoreInsurance method for this purpose)
        double totalCost = 0;
        for (ShippingItem i : itemList){
            if(i instanceof InsuredShippingItem){
                ((InsuredShippingItem) i).addMoreInsurance(30); 
            }
            totalCost+=i.getCost(); 
        }
        System.out.println(totalCost);  // should print 345.0
    }
}
