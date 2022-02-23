package mypackage;

public class Animal{
    
    String name;
    public String type;
    private int legs;
    protected boolean hasTail;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public boolean isHasTail() {
        return hasTail;
    }
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

}