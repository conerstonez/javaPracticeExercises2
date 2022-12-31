package Inheritance;

public class Goat extends Animal{
    @Override
    public void speak(){
        System.out.println("Bleat");
    }

    @Override
    public void move() {
        System.out.println("Roaming");
    }
}
