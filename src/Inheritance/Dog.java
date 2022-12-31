package Inheritance;

public class Dog extends Animal{

    public Dog(){
        super();
    }
    public void speak(){
        System.out.println("Barking like a dog");
    }

    public void eat(){
        System.out.println("Eat Bone");
    }

    @Override
    public void move() {
        System.out.println("Dog walk");
    }
}
