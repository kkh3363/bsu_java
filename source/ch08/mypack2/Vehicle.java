package mypack2;

public class Vehicle {
    public String model;
    public int wheel;
    public String manufact;

    public void honk(){
        System.out.println("Bung Bung~~~~");
    }
    public void printInfo(){
        System.out.print("Model : " + model);
        System.out.print("\nWheel : " + wheel);
        System.out.print("\nManufact : " + wheel + " \n");
    }
}
