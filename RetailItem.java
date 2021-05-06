package com.company;

//Program constructor sets item description, units on hand and price. Accessor and mutator methods for each instance.
public class RetailItem {

    private String itemDescription;
    private int unitsOnHand;
    private double itemPrice;

    public RetailItem(String description, int units, double price){
        itemDescription = description;
        unitsOnHand = units;
        itemPrice = price;
    }

    public void setItemDescription(String description){
        itemDescription = description;
    }

    public void setUnitsOnHand(int units) {
        unitsOnHand = units;
    }

    public void setItemPrice(double price){
        itemPrice = price;
    }


    public String getItemDescription(){
        return itemDescription;
    }

    public int getUnitsOnHand(){
        return unitsOnHand;
    }

    public double getItemPrice(){
        return itemPrice;
    }
}
