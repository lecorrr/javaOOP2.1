public class Dog extends Animal{
    private String name;

    public Dog() {
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice(){
        return "Woof";
    }
    @Override
    public void eat(){
        System.out.println("Dog " + getName() + " is eating " + getRation());
    }
    @Override
    public void sleep(){
        System.out.println("Dog " + getName() + " is sleeping");
    }
    @Override
    public String toString() {
        return "Dog [name=" + name + ", Ration=" + getRation() + ", Voice=" + getVoice() + ", Color="
                + getColor() + ", Weight=" + getWeight() + "]";
    }
}
