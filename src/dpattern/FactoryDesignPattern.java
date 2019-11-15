package dpattern;

import java.util.Scanner;

public class FactoryDesignPattern {

    public static void main(String[] args) {

        IAnimalFactory animalF = new AnimalFactoryImpl();
        System.out.println("Enter animal type here : ");
        animalF.getAnimalType(new Scanner(System.in).nextLine()).speek();


    }
}

/**
 * Here we are going to create our encapsulate details.
 * Need to encapsulate Animal details.
 */
interface IAnimal{
    void speek();
}

class Dog implements IAnimal{
    @Override
    public void speek() {
        System.out.println("Baw Baw");
    }
}

class Cat implements IAnimal{
    @Override
    public void speek() {
        System.out.println("Mew Mew");
    }
}

/**
 * Publish Animal details through this class.
 */
interface IAnimalFactory{
    IAnimal getAnimalType(String type);
}

class AnimalFactoryImpl implements IAnimalFactory{

    @Override
    public IAnimal getAnimalType(String type) {
        if(type.equalsIgnoreCase("Dog")){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
