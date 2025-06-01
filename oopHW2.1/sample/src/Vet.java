public class Vet {
    private String name;

    public Vet() {
    }
    
    public Vet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void treatment(Animal animal){
        System.out.println("Vet " + getName() + " has conducted treatment on " + animal.getClass() + " with following info:\n" + animal.getClass().toString());
        //Method can only get name of the class without explicitly receiving getName from Cat or Dog class
        //For that will be made 2 more methods for cat and dog instances
    }

    void catTreatment(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            System.out.println("Vet " + getName() + " has conducted treatment on " + cat.getName() + " with following info:\n" + cat.toString());
        }      
    }

    void dogTreatment(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println("Vet " + getName() + " has conducted treatment on " + dog.getName() + " with following info:\n" + dog.toString());
        }
    }

    @Override
    public String toString() {
        return "Vet [name=" + name + "]";
    }
}
