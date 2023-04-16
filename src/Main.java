// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* ClassDemo instance = new ClassDemo();
        instance.number = 15;
        instance.words = "New imagination";
        instance.printNumber();
        instance.printWords();

        ClassDemo instance2 = new ClassDemo();
        instance2.printNumber();*/

       /* ClassLamp kitchen = new ClassLamp("Kitchen");
        ClassLamp bedroom = new ClassLamp("Bedroom");
        kitchen.checkLamp();
        bedroom.checkLamp();
        kitchen.lamp = true;
        kitchen.checkLamp();*/

     /*   ClassPrograming instance = new ClassPrograming("Java");
        instance.completeLearning();
        instance.learningStatus();*/

        ClassCat cat = new ClassCat("Jerry", "Vietnamese black");
        cat.setName("Suri");
        System.out.println("I have a cat named "+ cat.getName() + " who is " + cat.getBreed() + ".");
        cat.makeSound();
        cat.sleep();

        ClassDog dog = new ClassDog("Pluto","English chihuahua");
        System.out.println(dog.getName() + "is a " + dog.getBreed());
        dog.makeSound();
        dog.sleep();
        dog.goodBoy();



    }
}
