package mypack2;

public class Truck extends Vehicle{
    public int weight;
    
    public Truck(String model, int wheel, String manufact){
        super.model = model;
        super.wheel = wheel;
        super.manufact = manufact;
    }
    public void printWeight(){
        super.printInfo();
        System.out.println("Weight : " + weight);
    }
}
