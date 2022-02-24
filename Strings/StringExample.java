public class StringExample {
    public static void main(String[] args) {
        String str="Hello world\n";
        
        str+="This is line 1\n";
        str+="This is line 2\n";
        str+="This is line 3\n";
        str+="This is line 4\n";
        str+="This is line 5\n";

        StringBuilder builder =new StringBuilder("Java :-\n");
        builder.append("Java is simple\n");
        builder.append("Java is Object oriented\n");
        builder.append("Java is robusy\n");
        builder.append("Java is secure\n");
        builder.append("Java is portable\n");

        StringBuffer buffer=new StringBuffer("OOP :-\n");
        buffer.append("Class\n");
        buffer.append("Object\n");
        buffer.append("Abstraction\n");
        buffer.append("Encapsulation\n");
        buffer.append("Inheritance\n");

        System.out.println(str.toUpperCase().trim());
        System.out.println(builder.toString().toUpperCase().trim());
        System.out.println(buffer.toString().toUpperCase().trim());
    }
}