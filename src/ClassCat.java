public class ClassCat extends ClassAnimal {

    private String name;
    private String breed;

    public ClassCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }


    @Override
    void makeSound() {
        System.out.println("meow");
    }
}
