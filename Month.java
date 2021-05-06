package com.company;

//Program takes in month as number or name. Returns month number and name. Can also compare months.
public class Month {

    private int monthNumber;

    public Month() {
        monthNumber = 1;
    }

    public Month(int month){
        if (month < 1 || month > 12){
            monthNumber = 1;
        } else {
            monthNumber = month;
        }
    }

    public Month(String month){
        if (month.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (month.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (month.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (month.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (month.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (month.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (month.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (month.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (month.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (month.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (month.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (month.equalsIgnoreCase("December")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    }

    public void setMonthNumber(int month){
        monthNumber = month;
    }

    public int getMonthNumber(){
        return monthNumber;
    }

    public String getMonthName(){
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }

    public String toString() {
        return getMonthName();
    }

    public boolean equals(Month month2) {
        if (month2.getMonthNumber() == monthNumber){
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Month month2) {
        if (monthNumber > month2.getMonthNumber()){
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThan(Month month2){
        if (monthNumber < month2.getMonthNumber()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){}
}
