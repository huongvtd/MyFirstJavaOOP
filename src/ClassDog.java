public class ClassDog extends ClassAnimal{


    public ClassDog(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("bark");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public void goodBoy(){
        System.out.println(name + ", come here!");
    }
}
