interface Parser {
    String parse(String str);
}

class StringParser implements Parser {

    public String parse(String str) {
        return str.toUpperCase();
    }
}

class Printer {
    public void print(String str, Parser p) {
        str = p.parse(str);
        System.out.println(str);
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        String str = "Java is awesome!";

        // older way, paasing anonymous interface
        Printer printer = new Printer();
        printer.print(str, new Parser() {
            public String parse(String str) {
                return str.toUpperCase();
            }
        });

        // lambda expression
        printer.print(str, (s -> s.toUpperCase()));

        // using method reference (passing method)
        StringParser stringParser = new StringParser();
        printer.print(str, (stringParser::parse));
    }
}
