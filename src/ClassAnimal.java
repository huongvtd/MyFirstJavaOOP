abstract class ClassAnimal {
    protected String name;
    private String breed;
    public ClassAnimal(String name, String breed) {
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
abstract void makeSound ();

public void sleep (){
    System.out.println("Sleeping");
}


}
