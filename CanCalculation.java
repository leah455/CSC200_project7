package com.company;

// Program constructor takes in can height and radius. Able to calculate surface area and volume and return it.
public class CanCalculation {

    private int canHeight;
    private int canRadius;
    private double surfaceArea;
    private double volume;

    public CanCalculation(int height, int radius){
        canHeight = height;
        canRadius = radius;
    }

    public double getSurfaceArea(){
        surfaceArea = (2 * Math.PI * canRadius * canHeight) + (2 * Math.PI * canRadius * canRadius);
        return surfaceArea;
    }

    public double getVolume() {
        volume = Math.PI * canRadius * canRadius * canHeight;
        return volume;
    }

    public static void main(String[] args){}
}
