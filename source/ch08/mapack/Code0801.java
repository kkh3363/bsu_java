package mapack;

public class Code0801 {
    public static void main(String[] args) {
        Dog hunter = new Dog();
        Cat cat = new Cat();

        hunter.name = "Superman"; hunter.strColor = "black";
        cat.name = "Wonder";  cat.strColor = "white";

        hunter.printDog();
        cat.printCat();
    }

}
