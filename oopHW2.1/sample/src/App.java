public class App {
    public static void main(String[] args) {
        
        Vet vet = new Vet("*VetName*");
        Animal viewCat = new Cat("cat food", "white", 4, "*CatName*");
        Animal viewDog = new Dog("dog food", "black", 8, "*DogName*");

        //vet.treatment(viewCat);
        //vet.treatment(viewDog);
        
        System.out.println();
        vet.catTreatment(viewCat);
        System.out.println();
        vet.dogTreatment(viewDog);

    }
}
