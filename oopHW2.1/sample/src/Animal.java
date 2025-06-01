public class Animal {

    private String ration;
    private String color;
    private int weight;
    
    public Animal() {
    }

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice(){
        return "Animal has produced sound";
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
    }
    

}
