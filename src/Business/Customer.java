/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author dista
 */
public class Customer {

    private String customerName;
    private String customerAddr;
    private String floorType;
    private double length;
    private double width;
    private double floorArea;
    private double floorCost;

    public Customer() {
    }

    public Customer(String customerName, String customerAddr, String floorType, double length, double width) {
        this.customerName = customerName;
        this.customerAddr = customerAddr;
        this.floorType = floorType;
        this.length = length;
        this.width = width;
    }
//getters and setters

    public String getCustomerName() {
        return customerName;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getFloorArea() {
        return length * width;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    public double getFloorCost() {
        String fType = getFloorType();
        double cost = 0;
        if (fType == "Wood") {
            cost = 20;
        }
        if (fType == "Carpet") {
            cost = 10;
        }
        return getFloorArea() * cost;
    }

    public void setFloorCost(double floorCost) {
        this.floorCost = floorCost;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddr() {
        return customerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }
    
    public String StingIT() {
        return customerName + "\n"
             + customerAddr + "\n"
             + floorType + "\n"
             + getFloorArea() + "\n"
             + getFloorCost() + "\n";
    }

    @Override
    public String toString() {
        return customerName;
    }

}
