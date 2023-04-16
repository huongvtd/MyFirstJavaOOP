public class ClassCat extends ClassAnimal {
    public ClassCat(String name, String breed) {
        super(name,breed);
    }

    @Override
    void makeSound() {
        System.out.println("meow");
    }
}
