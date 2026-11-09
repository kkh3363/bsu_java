package mypack2;

public class Texi extends Vehicle{
    public int passenger;
    
    public Texi(String model, int wheel, String manufact){
        super.model = model;
        super.wheel = wheel;
        super.manufact = manufact;
    }
    public void printPassenger(){
        super.printInfo();
        System.out.println("Weight : " + passenger);
    }
}
