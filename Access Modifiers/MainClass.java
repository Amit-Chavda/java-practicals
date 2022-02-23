import mypackage.Animal;

public class MainClass {
    public static void main(String args[]){
        Animal animal = new Animal();
        animal.setType("Dog");
        animal.setName("Husky");
        animal.setHasTail(true);
        animal.setLegs(4);

        //System.out.println("Name : "+animal.name); //Compile time error as its scope is limited within packge 
        System.out.println("Type : "+animal.type);
        //System.out.println("Has tail : "+animal.hasTail); //   Compile time error as it can only accessed by immediate subcalsse
        //System.out.println("Legs : "+animal.legs); //Compile time error as its not visible in this scope and it is a private
    }
}
