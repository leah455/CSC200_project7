package com.company;

//Program constructor takes in fuel efficiency and can add fuel to car to stimulate driving a certain amount of miles.
public class Car {

    private int mpg;
    private int fuel;

    public Car(int efficiency){
        mpg = efficiency;
        fuel = 0;
    }

    public void drive(int miles){
        fuel -= miles / mpg;
    }

    public void addGas(int gas){
        fuel += gas;
    }

    public int getGasLevel(){
        return fuel;
    }

    public static void main(String[] args){}
}
