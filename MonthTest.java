package com.company;

public class MonthTest {

    public static void main(String[] args){
        Month month1 = new Month();
        System.out.println(month1);
        month1.setMonthNumber(6);
        System.out.println(month1);


        Month month2 = new Month(4);
        System.out.println(month2);
        System.out.println(month2.equals(month1));
        System.out.println(month2.greaterThan(month1));
        System.out.println(month2.lessThan(month1));


        Month month3 = new Month("september");
        System.out.println(month3);
        System.out.println(month3.getMonthNumber());
        System.out.println(month3.getMonthName());
    }
}
