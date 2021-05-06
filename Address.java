package com.company;

/*
Program takes in addresses containing a house number, street name, optional apartment number,
city, state and postal code. Method to display address. Method to test whether a postal code comes before another
postal code.
 */
public class Address {

    private int houseNumber;
    private String streetName;
    private int apartmentNumber;
    private String cityName;
    private String stateName;
    private int postalCode;

    //Constructor with apartment number
    public Address(int house, String street, int apartment, String city, String state, int postal) {
        houseNumber = house;
        streetName = street;
        apartmentNumber = apartment;
        cityName = city;
        stateName = state;
        postalCode = postal;
    }

    //Constructor without apartment number
    public Address(int house, String street, String city, String state, int postal) {
        houseNumber = house;
        streetName = street;
        cityName = city;
        stateName = state;
        postalCode = postal;
    }

    public void printAddress() {

        if (apartmentNumber != 0){
            System.out.println(houseNumber + " " + streetName + " Apt " + apartmentNumber);
        } else {
            System.out.println(houseNumber + " " + streetName);
        }
        System.out.println(cityName + "," + stateName + " " + postalCode);
    }

    public boolean comesBefore(Address otherAddress) {
        if (postalCode < otherAddress.postalCode){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
    }
}
