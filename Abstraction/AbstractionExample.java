interface Person{
    void canWalk();
    void canTalk();
}

class Man implements Person{
    @Override
    public void canWalk() {
        System.out.println("Man can walk");
    }

    @Override
    public void canTalk() {
        System.out.println("Man can talk");
    }
}

public class AbstractionExample{
    public static void main(String args[]){
        Man man=new Man();
        man.canWalk();
        man.canTalk();
    }
}