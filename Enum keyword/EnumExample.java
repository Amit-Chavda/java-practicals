enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
}

public class EnumExample {
    public static void main(String[] args) {
        Day days[] = Day.values();

        for (Day day : days) {
            System.out.println(day);
        }
    }

}