class Color{
    static String BLACK="black";

    static{
        System.out.println("static block executed");
    }
    public  static void showColor(){
        System.out.println("static method executed ...Color : "+BLACK);
    }
}


public class StaticKeywordExample{
  
    public static void main(String[] args) {
        System.out.println("Color name :"+Color.BLACK);
        Color.showColor();
    }
}