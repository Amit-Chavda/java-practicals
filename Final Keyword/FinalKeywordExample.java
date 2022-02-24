class Math{
    final double PIE=3.14d;

    final double getPIE(){
        return PIE;
    }
}

public class FinalKeywordExample{
    public static void main(String args[]){
        Math math=new Math();

        System.out.println("PIE : "+math.getPIE()); // calling final method is possible while overrriding is not possible
        math.PIE=2.25d;
    }
}