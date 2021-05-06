package com.company;

public class RetailItemTest {

    public static void main(String[] args){
        RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
        RetailItem jeans = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem shirt = new RetailItem("Shirt", 20, 24.95);

        System.out.println(jacket.getItemDescription());
        System.out.println(jeans.getUnitsOnHand());
        System.out.println(shirt.getItemPrice());

        jacket.setItemPrice(65.95);
        System.out.println(jacket.getItemPrice());
        jeans.setItemDescription("Best Designer Jeans");
        System.out.println(jeans.getItemDescription());
        shirt.setUnitsOnHand(450);
        System.out.println(shirt.getUnitsOnHand());
    }
}
