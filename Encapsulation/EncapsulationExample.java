class Animal{
    private String name;
    private boolean hasTail;
    private int numberOfLegs;
    private float height;
    private double weight;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isHasTail() {
        return hasTail;
    }
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Animal [Name=" + name + ", \nHeight=" + height + ", \nHas tail?=" + hasTail + ", \nNumber of legs=" + numberOfLegs
                + ", \nWeight=" + weight + "]";
    }
}

public class EncapsulationExample{
    public static void main(String args[]){
        Animal dog=new Animal();

        dog.setName("Husky");
        dog.setHasTail(true);
        dog.setHeight(2.5f);
        dog.setNumberOfLegs(4);
        dog.setWeight(25);

        System.out.println(dog);
    }
}