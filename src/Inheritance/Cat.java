package Inheritance;

public class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Catwalks");
    }

    public void chaseMice(){
        System.out.println("Tom and Jerry");
    }
}
