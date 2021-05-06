package com.company;

public class AddressTest {

    public static void main(String[] args){

        Address address1 = new Address(9505, "Scorpio Ln", "Fairfax", "VA", 20584);
        address1.printAddress();

        Address address2 = new Address(1111, "Preston Drive", 2,
                "Charlottesville", "VA", 22034);
        address2.printAddress();

        System.out.println(address1.comesBefore(address2));
    }
}
